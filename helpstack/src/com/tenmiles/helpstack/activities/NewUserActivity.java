//  NewUserActivity
//
//Copyright (c) 2014 HelpStack (http://helpstack.io)
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in
//all copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//THE SOFTWARE.

package com.tenmiles.helpstack.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

import com.tenmiles.helpstack.R;
import com.tenmiles.helpstack.fragments.HSFragmentManager;
import com.tenmiles.helpstack.fragments.NewUserFragment;

public class NewUserActivity extends HSActivityParent {
	
	private static final String TAG = "NewUser";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hs_activity_new_user);
		
		if (savedInstanceState == null) {
            Bundle bundle = getIntent().getExtras();
            NewUserFragment newUserFragment = new NewUserFragment();
            newUserFragment.setArguments(bundle);
            HSFragmentManager.putFragmentInActivity(this, R.id.container, newUserFragment, TAG);
        }
	}
	
	@Override
	public void configureActionBar(ActionBar actionBar) {
		super.configureActionBar(actionBar);
		actionBar.setTitle(getString(R.string.hs_new_issue_title));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == android.R.id.home) {
			HSActivityManager.finishSafe(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	

}
