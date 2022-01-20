package com.example.harmonyosjava.slice;

import com.example.harmonyosjava.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);// 加载layout目录下的XML布局
        Button button = (Button) findComponentById(ResourceTable.Id_button);
        // 点击按钮跳转至第二个页面
        button.setClickedListener(listener -> present(new SecondAbilitySlice(), new Intent()));
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
