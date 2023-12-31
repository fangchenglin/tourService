package com.sx.tourService.controller;

import com.sx.tourService.entity.Hotel;
import com.sx.tourService.service.HotelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Hotel)表控制层
 *
 * @author makejava
 * @since 2023-07-04 15:26:05
 */
@RestController
@RequestMapping("hotel")
public class HotelController {
    /**
     * 服务对象
     */
    @Resource
    private HotelService hotelService;

    /**
     * 分页查询
     *
     * @param hotel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Hotel>> queryByPage(Hotel hotel, PageRequest pageRequest) {
        return ResponseEntity.ok(this.hotelService.queryByPage(hotel, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Hotel> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.hotelService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param hotel 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Hotel> add(Hotel hotel) {
        return ResponseEntity.ok(this.hotelService.insert(hotel));
    }

    /**
     * 编辑数据
     *
     * @param hotel 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Hotel> edit(Hotel hotel) {
        return ResponseEntity.ok(this.hotelService.update(hotel));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.hotelService.deleteById(id));
    }

}

