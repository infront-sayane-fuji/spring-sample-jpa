package jp.co.infrontinc.springjpatest.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "m_user")
public class User implements Serializable {

	/**
	 * ID(シーケンスで自動採番)
	 * 
	 */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m_user_id_seq")
    @SequenceGenerator(name = "m_user_id_seq", sequenceName = "m_user_id_seq", allocationSize = 1)    
    private Long id;

    /**
     * 名前
     */
    @Column(name = "name")
    private String name;

    /**
     * 住所
     */
    @Column(name = "address")
    private String address;

    /**
     * 電話番号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 更新日時
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 登録日時
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 削除日時
     */
    @Column(name = "delete_date")
    private Date deleteDate;
}