/**
 * 
 */
package com.nickaknudson.mva.callbacks;

import com.nickaknudson.mva.Model;

/**
 * @author nick
 *
 */
public interface ReceiveCallback<T extends Model<T>> extends Callback {
	public void onReceive(T model);
}
