package com.ritisha.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity(name = "member")
@Data
public class MemberDTO {

    @Id
    Integer mId;
    String mName;
    String ownerName;
    String managerName;
    String address;
    String location;
    String pincode;
    Integer policeStId;
    Integer dist_id;
    Integer cityId;
    String taluka;
    Integer stateId;
    Integer countryId;
    String license;
    String scanDocuments;
    String docno;
    String documentPhoto;
    String memberphoto;
    Integer contactPhone;
    Integer mobileNo;
    String email;
    String username;
    String password;
    String bkp;
    String status;
    String type;
    String division;
    String forgotpasswordLink;
    String main_zone;
    Integer sdpo_id;
    Integer adsp_id;
    String area;
    Integer error;
    String sms_sent;
    Integer loginfail_count;
    String salesperson;
    Integer sms_count;
    String receipt_no;
    String e_receipt_no;
    String formdate;
    String data_entry_person;
    Integer audit;
    Integer paid;
    String audit_by;
    Integer paid_by;


}
