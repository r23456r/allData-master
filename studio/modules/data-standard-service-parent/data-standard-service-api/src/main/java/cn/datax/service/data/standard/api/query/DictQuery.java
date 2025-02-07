package cn.datax.service.data.standard.api.query;

import cn.datax.common.base.BaseQueryParams;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 数据标准字典表 查询实体
 * </p>
 *
 * @author AllDataDC
 * @date 2022-11-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DictQuery extends BaseQueryParams {

    private static final long serialVersionUID=1L;

    private String typeId;
    private String gbCode;
    private String gbName;
}
