//
// java-signals
// Copyright (c) 2011 Three Rings Design, Inc.
// http://github.com/threerings/java-signals
//
// Permission is hereby granted, free of charge, to any person
// obtaining a copy of this software and associated documentation
// files (the "Software"), to deal in the Software without
// restriction, including without limitation the rights to use,
// copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the
// Software is furnished to do so, subject to the following
// conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
// OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
// HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
// OTHER DEALINGS IN THE SOFTWARE.

package com.threerings.signals;

public interface SignalConnector3<A, B, C>
{
    /** Adds <code>listener</code> at {@link Signals#DEFAULT_PRIORITY}. */
    Connection connect (Listener0 listener);

    /**
     * Adds <code>listener</code> at <code>priority</code>. Listeners with a higher priority will
     * have their apply called before listeners with a lower priority. Listeners with equal priority
     * are applied in the order they're added to the signal.
     */
    Connection connect (Listener0 listener, int priority);

    /** Adds <code>listener</code> at {@link Signals#DEFAULT_PRIORITY}. */
    Connection connect (Listener1<? super A> listener);

    /**
     * Adds <code>listener</code> at <code>priority</code>. Listeners with a higher priority will
     * have their apply called before listeners with a lower priority. Listeners with equal priority
     * are applied in the order they're added to the signal.
     */
    Connection connect (Listener1<? super A> listener, int priority);

    /** Adds <code>listener</code> at {@link Signals#DEFAULT_PRIORITY}. */
    Connection connect (Listener2<? super A, ? super B> listener);

    /**
     * Adds <code>listener</code> at <code>priority</code>. Listeners with a higher priority will
     * have their apply called before listeners with a lower priority. Listeners with equal priority
     * are applied in the order they're added to the signal.
     */
    Connection connect (Listener2<? super A, ? super B> listener, int priority);

    /** Adds <code>listener</code> at {@link Signals#DEFAULT_PRIORITY}. */
    Connection connect (Listener3<? super A, ? super B, ? super C> listener);

    /**
     * Adds <code>listener</code> at <code>priority</code>. Listeners with a higher priority will
     * have their apply called before listeners with a lower priority. Listeners with equal priority
     * are applied in the order they're added to the signal.
     */
    Connection connect (Listener3<? super A, ? super B, ? super C> listener, int priority);

    /** Removes <code>listener</code> from this signal if it's present.*/
    void disconnect (Listener listener);
}
