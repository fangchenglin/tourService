package com.sx.tourService.dao;

import com.sx.tourService.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Hotel)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-04 15:26:05
 */

@Mapper
public interface HotelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param hId 主键
     * @return 实例对象
     */
    Hotel queryById(Integer hId);

    /**
     * 查询指定行数据
     *
     * @param hotel 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Hotel> queryAllByLimit(Hotel hotel, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param hotel 查询条件
     * @return 总行数
     */
    long count(Hotel hotel);

    /**
     * 新增数据
     *
     * @param hotel 实例对象
     * @return 影响行数
     */
    int insert(Hotel hotel);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hotel> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Hotel> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hotel> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Hotel> entities);

    /**
     * 修改数据
     *
     * @param hotel 实例对象
     * @return 影响行数
     */
    int update(Hotel hotel);

    /**
     * 通过主键删除数据
     *
     * @param hId 主键
     * @return 影响行数
     */
    int deleteById(Integer hId);

}

