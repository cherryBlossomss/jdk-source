package org.omg.IOP;


/**
* org/omg/IOP/MultipleComponentProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u211/12973/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, April 1, 2019 8:55:05 PM PDT
*/


/** An array of tagged components, forming a multiple component profile. */
public final class MultipleComponentProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedComponent value[] = null;

  public MultipleComponentProfileHolder ()
  {
  }

  public MultipleComponentProfileHolder (org.omg.IOP.TaggedComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.MultipleComponentProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.MultipleComponentProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.MultipleComponentProfileHelper.type ();
  }

}
