package com.sx.tourService.dao;

import com.sx.tourService.entity.EmergeMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (EmergeMsg)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-04 15:16:24
 */

@Mapper
public interface EmergeMsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    EmergeMsg queryById(Integer mId);

    /**
     * 查询指定行数据
     *
     * @param emergeMsg 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<EmergeMsg> queryAllByLimit(EmergeMsg emergeMsg, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param emergeMsg 查询条件
     * @return 总行数
     */
    long count(EmergeMsg emergeMsg);

    /**
     * 新增数据
     *
     * @param emergeMsg 实例对象
     * @return 影响行数
     */
    int insert(EmergeMsg emergeMsg);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<EmergeMsg> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<EmergeMsg> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<EmergeMsg> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<EmergeMsg> entities);

    /**
     * 修改数据
     *
     * @param emergeMsg 实例对象
     * @return 影响行数
     */
    int update(EmergeMsg emergeMsg);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 影响行数
     */
    int deleteById(Integer mId);

}

