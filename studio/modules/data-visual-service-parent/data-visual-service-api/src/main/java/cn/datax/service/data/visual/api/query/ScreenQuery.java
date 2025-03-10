package cn.datax.service.data.visual.api.query;

import cn.datax.common.base.BaseQueryParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 可视化酷屏配置信息表 查询实体
 * </p>
 *
 * @author AllDataDC
 * @date 2022-11-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ScreenQuery extends BaseQueryParams {

    private static final long serialVersionUID=1L;

    private String screenName;
}
