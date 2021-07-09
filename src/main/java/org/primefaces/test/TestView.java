package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

  private String string;
  private Integer integer;
  private BigDecimal decimal;
  private LocalDateTime localDateTime;
  private List<String> values;

  @PostConstruct
  public void init() {
    string = "Welcome to PrimeFaces!!!";
    values = List.of("some", "example", "values");
  }

  public List<String> getValues() {
    return this.values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

}
