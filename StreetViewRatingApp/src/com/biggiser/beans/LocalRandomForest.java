package com.biggiser.beans;

import java.util.ArrayList;
import java.util.List;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

/**
 * @author Jiale Wang , Yao Yao
 * HPSCIL & LIESMARS
 */
public class LocalRandomForest {

	//构建数据集
	public static Instances BuildInstances(UserRatingBean userRating,String className){
		System.out.println("building "+ className +"trainging set----");
		
		ArrayList<Attribute> atts=new ArrayList<>();
		for(int i=0;i<Init.featureDimension;i++){
			atts.add(new Attribute(Init.featureTitle.get(i)));
		}
		atts.add(new Attribute(className));//哪一种情感
		
		Instances data=new Instances("userId:"+userRating.getId()+" ratingNum: "+ userRating.getScoredImg().size() 
				+" regressionRandomForest",atts,0);
		
		List<BaseScore> scoredImg=userRating.getScoredImg();
		for(int i=0;i<scoredImg.size();i++){//行数
			String filename=scoredImg.get(i).fileName;
			double[] d=new double[Init.featureDimension+1];
			int imgId=Init.imgNameHash.get(filename);//根据打分的文件名在hash表里面找唯一id
			//根据id设置对应的feature列
			for(int j=0;j<Init.featureDimension;j++){
				d[j]=Init.imgScores.get(imgId).getFeatures().get(j);
			}
			d[Init.featureDimension]=scoredImg.get(i).getScore(className);		
			Instance instance=new DenseInstance(1,d);
			data.add(instance);
		}
		
		System.out.println("building "+ className +"trainging set----end");
			
		return data;
	}
	
	//构建默认数据集
	public static Instances BuildInstances(String className, int imgId){	
		ArrayList<Attribute> atts=new ArrayList<>();
		for(int i=0;i<Init.featureDimension;i++){
			atts.add(new Attribute(Init.featureTitle.get(i)));
		}
		atts.add(new Attribute(className));//哪一种情感
		
		Instances data = new Instances("regressionRandomForestTesting",atts,0);
		double[] d=new double[Init.featureDimension+1];
		for(int i=0;i<Init.featureDimension;i++){
			d[i]=Init.imgScores.get(imgId).getFeatures().get(i);
		}
		d[Init.featureDimension]=0;
		Instance instance=new DenseInstance(1,d);
		data.add(instance);
		
		return data;
	}
}
