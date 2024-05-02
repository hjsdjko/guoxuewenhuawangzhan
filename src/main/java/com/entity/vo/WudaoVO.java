package com.entity.vo;

import com.entity.WudaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 舞蹈
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-07
 */
@TableName("wudao")
public class WudaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 舞蹈名
     */

    @TableField(value = "wudao_name")
    private String wudaoName;


    /**
     * 舞蹈图片
     */

    @TableField(value = "wudao_photo")
    private String wudaoPhoto;


    /**
     * 舞蹈视频
     */

    @TableField(value = "wudao_video")
    private String wudaoVideo;


    /**
     * 舞蹈详情
     */

    @TableField(value = "wudao_content")
    private String wudaoContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：舞蹈名
	 */
    public String getWudaoName() {
        return wudaoName;
    }


    /**
	 * 获取：舞蹈名
	 */

    public void setWudaoName(String wudaoName) {
        this.wudaoName = wudaoName;
    }
    /**
	 * 设置：舞蹈图片
	 */
    public String getWudaoPhoto() {
        return wudaoPhoto;
    }


    /**
	 * 获取：舞蹈图片
	 */

    public void setWudaoPhoto(String wudaoPhoto) {
        this.wudaoPhoto = wudaoPhoto;
    }
    /**
	 * 设置：舞蹈视频
	 */
    public String getWudaoVideo() {
        return wudaoVideo;
    }


    /**
	 * 获取：舞蹈视频
	 */

    public void setWudaoVideo(String wudaoVideo) {
        this.wudaoVideo = wudaoVideo;
    }
    /**
	 * 设置：舞蹈详情
	 */
    public String getWudaoContent() {
        return wudaoContent;
    }


    /**
	 * 获取：舞蹈详情
	 */

    public void setWudaoContent(String wudaoContent) {
        this.wudaoContent = wudaoContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}