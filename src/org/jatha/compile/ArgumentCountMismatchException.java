/*
 * Jatha - a Common LISP-compatible LISP library in Java.
 * Copyright (C) 1997-2005 Micheal Scott Hewett
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *
 * For further information, please contact Micheal Hewett at
 *   hewett@cs.stanford.edu
 *
 */
/* Copyright (c) 1997    Micheal Hewett   hewett@cs.stanford.edu
 *
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 *  This source code is copyrighted as shown above.  If this
 *  code was obtained as part of a freeware or shareware release,
 *  assume that the provisions of the Gnu "copyleft" agreement
 *  apply.
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 *
 *        File:  CompilerException.java
 *
 *      Author:  Micheal Hewett
 *     Created:  03 Feb 1997
 *
 *    Compiler:  javac 1.0.2
 *
 * Description:  Exceptions generated by the compiler.
 *
 ****************************************************************************
 *  Content Summary
 *  ---------------
 *
 *
 *
 *  Classes:
 *
 *     CompilerException                  (abstract)
 *       ArgumentCountMismatchException
 *       UndefinedFunctionException
 *       UndefinedVariableException
 *       WrongArgumentTypeException
 *
 *
 ****************************************************************************
 */

package org.jatha.compile;





//--------------------------  LispException  ---------------------------------

public class ArgumentCountMismatchException extends CompilerException
{
   ArgumentCountMismatchException()            { super();  }
   ArgumentCountMismatchException(String function,
				  String numArgsExpected,
				  long numArgsReceived)
   { super("The " + function + " function expects " + numArgsExpected
	   + " arguments, but received "+ numArgsReceived);
   }
}

