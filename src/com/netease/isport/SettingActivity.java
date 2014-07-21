package com.netease.isport;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import br.com.dina.ui.widget.UITableView;
import br.com.dina.ui.widget.UITableView.ClickListener;

public class SettingActivity extends Activity {

	UITableView tableView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_setting);
        
        tableView = (UITableView) findViewById(R.id.tableView);
        
        createList();
        
        Log.d("MainActivity", "total items: " + tableView.getCount());
        
        tableView.commit();
    }
    
    private void createList() {
    	CustomClickListener listener = new CustomClickListener();
    	tableView.setClickListener(listener);
    	tableView.addBasicItem(R.drawable.clock, "���ǰ����", "��ǰ30����");
    	tableView.addBasicItem(R.drawable.arm, "���ѷ�ʽ", "���û���ѷ�ʽ");
    	tableView.addBasicItem(R.drawable.account_set, "�޸ĸ�����Ϣ", "����ͷ���Ա��ǩ����");
    	tableView.addBasicItem(R.drawable.prefer, "�����˶�ƫ��", "ѡ������˶������������͵ľ����ʱ�䷶Χ");
    	tableView.addBasicItem(R.drawable.version, "����汾", "�汾̫�󣬳����ֻ��洢��Χ1.0");
    	tableView.addBasicItem(R.drawable.logout, "�˳���¼", "�˳���ǰ���˻�");
    }
    
    private class CustomClickListener implements ClickListener {

		@Override
		public void onClick(int index) {
			Toast.makeText(SettingActivity.this, "item clicked: " + index, Toast.LENGTH_SHORT).show();
		}
    	
    }
}