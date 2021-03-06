package com.example.SpringBootForArchiveSch.model.keys;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClassDeptKeys implements Serializable {



    @Column(name = "CLASSIFICATION_ID")
    Long classificationId;

    @Column(name = "DEPT_ID")
    Long deptId;

    @Column(name = "CLASS_SAVE_TYPE")
    Long classSaveTypeId;

    public ClassDeptKeys() {
    }

    public Long getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getClassSaveType() {
        return classSaveTypeId;
    }

    public void setClassSaveType(Long classSaveType) {
        this.classSaveTypeId = classSaveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDeptKeys that = (ClassDeptKeys) o;
        return Objects.equals(classificationId, that.classificationId) && Objects.equals(deptId, that.deptId) && Objects.equals(classSaveTypeId, that.classSaveTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classificationId, deptId, classSaveTypeId);
    }
}
