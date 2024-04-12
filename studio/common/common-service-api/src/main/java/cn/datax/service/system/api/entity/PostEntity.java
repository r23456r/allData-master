package cn.datax.service.system.api.entity;

import cn.datax.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author AllDataDC
 * @since 2023-01-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_market_post")
public class PostEntity extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 岗位名称
     */
    private String postName;

}
