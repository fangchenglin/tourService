package com.sx.tourService.dao;

import com.sx.tourService.entity.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Room)表数据库访问层
 *
 * @author makejava
 * @since 2023-07-04 15:26:33
 */
@Mapper
public interface RoomDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    Room queryById(Integer rId);

    /**
     * 查询指定行数据
     *
     * @param room 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Room> queryAllByLimit(Room room, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param room 查询条件
     * @return 总行数
     */
    long count(Room room);

    /**
     * 新增数据
     *
     * @param room 实例对象
     * @return 影响行数
     */
    int insert(Room room);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Room> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Room> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Room> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Room> entities);

    /**
     * 修改数据
     *
     * @param room 实例对象
     * @return 影响行数
     */
    int update(Room room);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 影响行数
     */
    int deleteById(Integer rId);

}

