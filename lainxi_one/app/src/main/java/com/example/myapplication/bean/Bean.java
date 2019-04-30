package com.example.myapplication.bean;

import java.util.List;

public class Bean {

    /**
     * code : 200
     * message : 成功!
     * result : [{"title":"初秋夜坐","content":"斜廊连绮阁，初月照宵帏。|塞冷鸿飞疾，园秋蝉噪迟。|露结林疏叶，寒轻菊吐滋。|愁心逢此节，长叹独含悲。","authors":"太宗皇帝"},{"title":"秋日二首 一","content":"菊散金风起，荷疏玉露圆。|将秋数行雁，离夏几林蝉。|云凝愁半岭，霞碎缬高天。|还似成都望，直见峨眉前。","authors":"太宗皇帝"},{"title":"秋日二首 二","content":"爽气澄兰沼，秋风动桂林。|露凝千片玉，菊散一丛金。|日岫高低影，云空点缀阴。|蓬瀛不可望，泉石且娱心。","authors":"太宗皇帝"},{"title":"冬宵各为四韵","content":"雕宫静龙漏，绮阁宴公侯。|珠帘烛焰动，绣柱月光浮。|云起将歌发，风停与管遒。","authors":"太宗皇帝"},{"title":"冬日临昆明池","content":"石鲸分玉溜，劫烬隐平沙。|柳影冰无叶，梅心冻有花。|寒野凝朝雾，霜天散夕霞。|欢情犹未极，落景遽西斜。","authors":"太宗皇帝"},{"title":"望雪","content":"冻云宵遍岭，素雪晓凝华。|入牖千重碎，迎风一半斜。|不妆空散粉，无树独飘花。|萦空惭夕照，破彩谢晨霞。","authors":"太宗皇帝"},{"title":"守岁","content":"暮景斜芳殿，年华丽绮宫。|寒辞去冬雪，暖带入春风。|阶馥舒梅素，盘花卷烛红。|共欢新故岁，迎送一宵中。","authors":"太宗皇帝"},{"title":"除夜","content":"岁阴穷暮纪，献节启新芳。|冬尽今宵促，年开明日长。|冰消出镜水，梅散入风香。|对此欢终宴，倾壶待曙光。","authors":"太宗皇帝"},{"title":"咏雨","content":"和气吹绿野，梅雨洒芳田。|新流添旧涧，宿雾足朝烟。|雁湿行无次，花霑色更鲜。|对此欣登岁，披襟弄五弦。","authors":"太宗皇帝"},{"title":"赋得含峰云","content":"翠楼含晓雾，莲峰带晚云。|玉叶依岩聚，金枝触石分。|横天结阵影，逐吹起罗文。|非复阳台下，空将惑楚君。","authors":"太宗皇帝"},{"title":"三层阁上置音声","content":"绮筵移暮景，紫阁引宵烟。|隔栋歌尘合，分阶舞影连。|声流三处管，响乱一重弦。|不似秦楼上，吹箫空学仙。","authors":"太宗皇帝"},{"title":"远山澄碧雾","content":"残云收翠岭，夕雾结长空。|带岫凝全碧，障霞隐半红。|髣髴分初月，飘飖度晓风。|还因三里处，冠盖远相通。","authors":"太宗皇帝"},{"title":"赋得花庭雾","content":"兰气已熏宫，新橤半妆丛。|色含轻重雾，香引去来风。|拂树浓舒碧，萦花薄蔽红。|还当杂行雨，髣髴隐遥空。","authors":"太宗皇帝"},{"title":"春池柳","content":"年柳变池台，隋堤曲直回。|逐浪丝阴去，迎风带影来。|疏黄一鸟弄，半翠几眉开。|萦雪临春岸，参差间早梅。","authors":"太宗皇帝"},{"title":"芳兰","content":"春晖开紫苑，淑景媚兰场。|映庭含浅色，凝露泫浮光。|日丽参差影，风传轻重香。|会须君子折，佩里作芬芳。","authors":"太宗皇帝"},{"title":"咏桃","content":"禁苑春晖丽，花蹊绮树妆。|缀条深浅色，点露参差光。|向日分千笑，迎风共一香。|如何仙岭侧，独秀隐遥芳。","authors":"太宗皇帝"},{"title":"赋帘","content":"参差垂玉阙，舒卷映兰宫。|珠光摇素月，竹影乱清风。|彩散银钩上，文斜桂户中。|惟当杂罗绮，相与媚房栊。","authors":"太宗皇帝"},{"title":"咏乌代陈师道","content":"凌晨丽城去，薄暮上林栖。|辞枝枝暂起，停树树还低。|向日终难托，迎风讵肯迷。|只待纤纤手，曲里作宵啼。","authors":"太宗皇帝"},{"title":"咏饮马","content":"骏骨饮长泾，奔流洒络缨。|细纹连喷聚，乱荇绕蹄萦。|水光鞍上侧，马影溜中横。|翻似天池里，腾波龙种生。","authors":"太宗皇帝"},{"title":"赋得残菊","content":"阶兰凝曙霜，岸菊照晨光。|露浓晞晚笑，风劲浅残香。|细叶凋轻翠，圆花飞碎黄。|还持今岁色，复结后年芳。","authors":"太宗皇帝"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * title : 初秋夜坐
         * content : 斜廊连绮阁，初月照宵帏。|塞冷鸿飞疾，园秋蝉噪迟。|露结林疏叶，寒轻菊吐滋。|愁心逢此节，长叹独含悲。
         * authors : 太宗皇帝
         */

        private String title;
        private String content;
        private String authors;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthors() {
            return authors;
        }

        public void setAuthors(String authors) {
            this.authors = authors;
        }
    }
}
