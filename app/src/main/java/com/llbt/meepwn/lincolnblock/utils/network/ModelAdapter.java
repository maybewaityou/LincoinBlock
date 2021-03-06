package com.llbt.meepwn.lincolnblock.utils.network;

import com.llbt.meepwn.lincolnblock.framework.Model;
import com.llbt.meepwn.lincolnblock.utils.network.json_parser.JsonParser;

/**
 * package: com.llbt.meepwn.lincolnblock.utils.network
 * author: MeePwn
 * email: maybewaityou@gmail.com
 * github: https://github.com/maybewaityou
 * date: 16/4/24 下午12:03
 * desc: 模型适配器
 */
@SuppressWarnings("unchecked")
public class ModelAdapter {

    public static <T extends Model> T modelWithJsonString(String jsonString, Class clazz, Class targetClass) {
        return JsonParser.<T>parse(jsonString, clazz, targetClass);
    }

}
