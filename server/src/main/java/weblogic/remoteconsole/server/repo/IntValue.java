// Copyright (c) 2021, Oracle and/or its affiliates.
// Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl.

package weblogic.remoteconsole.server.repo;

/**
 * This class holds an int value.
 */
public class IntValue extends Value {

  private int value;

  public IntValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return "IntValue<" + getValue() + ">";
  }
}
