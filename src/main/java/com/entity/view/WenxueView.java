package com.entity.view;

import com.entity.WenxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 文学
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("wenxue")
public class WenxueView extends WenxueEntity implements Serializable {
    private static final long serialVersionUID = 1L;



	public WenxueView() {

	}

	public WenxueView(WenxueEntity wenxueEntity) {
		try {
			BeanUtils.copyProperties(this, wenxueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}















}
