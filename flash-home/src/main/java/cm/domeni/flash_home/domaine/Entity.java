package cm.domeni.flash_home.domaine;

import java.io.Serializable;

public interface Entity<T extends Serializable> {
  T getId();

  void setId(T id);

  boolean isDeleted();

  void markAsDeleted();

  void markAsNotDeleted();
}
