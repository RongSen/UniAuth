use uniauth;
INSERT INTO user_extend(code, description) SELECT 'cast_wechat_id','openid' FROM DUAL WHERE NOT EXISTS(SELECT id FROM user_extend WHERE code = 'cast_wechat_id');