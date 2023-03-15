package com.example.finaltest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoetryTitleFragment extends Fragment {
        private boolean isTwoPane;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.poetry_title_fragment,container,false);
        RecyclerView poetryTitleRecyclerView=(RecyclerView) view.findViewById(R.id.poetry_title_recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        poetryTitleRecyclerView.setLayoutManager(layoutManager);
        PoetryAdapter adapter=new PoetryAdapter(getPoetry());
        poetryTitleRecyclerView.setAdapter(adapter);
        return view;
    }

    private List<Poetry>getPoetry(){
        List<Poetry>poetryList=new ArrayList<>();
            Poetry poetry1=new Poetry();
            Poetry poetry2=new Poetry();
            Poetry poetry3=new Poetry();
            Poetry poetry4=new Poetry();
            Poetry poetry5=new Poetry();
            Poetry poetry6=new Poetry();
            Poetry poetry7=new Poetry();
            Poetry poetry8=new Poetry();
            Poetry poetry9=new Poetry();
            Poetry poetry10=new Poetry();
            Poetry poetry11=new Poetry();
            Poetry poetry12=new Poetry();
            Poetry poetry13=new Poetry();
            Poetry poetry14=new Poetry();
            Poetry poetry15=new Poetry();
            Poetry poetry16=new Poetry();
            Poetry poetry17=new Poetry();
            Poetry poetry18=new Poetry();
            Poetry poetry19=new Poetry();
            Poetry poetry20=new Poetry();
            poetry1.setTitle("观沧海");
            poetry1.setContent("                                                                                     东临碣石，以观沧海。\n" +
                    "                                                                                     水何澹澹，山岛竦峙。\n" +
                    "                                                                                     树木丛生，百草丰茂。\n" +
                    "                                                                                     秋风萧瑟，洪波涌起。\n" +
                    "                                                                                     日月之行，若出其中；\n" +
                    "                                                                                     星汉灿烂，若出其里。\n" +
                    "                                                                                     幸甚至哉，歌以咏志。");
            poetryList.add(poetry1);
        poetry2.setTitle("子衿");
        poetry2.setContent("                                                                                     青青子衿，悠悠我心。\n" +
                "                                                                                   纵我不往，子宁不嗣音？\n" +
                "                                                                                     青青子佩，悠悠我思。\n" +
                "                                                                                     纵我不往，子宁不来？\n" +
                "                                                                                     挑兮达兮，在城阙兮。\n" +
                "                                                                                     一日不见，如三月兮。");
        poetryList.add(poetry2);
        poetry3.setTitle("短歌行");
        poetry3.setContent("                                                                                     对酒当歌，人生几何！\n" +
                "                                                                                     譬如朝露，去日苦多。\n" +
                "                                                                                     慨当以慷，忧思难忘。\n" +
                "                                                                                     何以解忧？唯有杜康。\n" +
                "                                                                                     青青子衿，悠悠我心。\n" +
                "                                                                                     但为君故，沉吟至今。\n" +
                "                                                                                     呦呦鹿鸣，食野之苹。\n" +
                "                                                                                     我有嘉宾，鼓瑟吹笙。\n" +
                "                                                                                     明明如月，何时可掇？\n" +
                "                                                                                     忧从中来，不可断绝。\n" +
                "                                                                                     越陌度阡，枉用相存。\n" +
                "                                                                                     契阔谈䜩，心念旧恩。\n" +
                "                                                                                     月明星稀，乌鹊南飞。\n" +
                "                                                                                     绕树三匝，何枝可依？\n" +
                "                                                                                     山不厌高，海不厌深。\n" +
                "                                                                                     周公吐哺，天下归心。");
        poetryList.add(poetry3);
        poetry4.setTitle("龟虽寿");
        poetry4.setContent("                                                                                     神龟虽寿，犹有竟时。\n" +
                "                                                                                     腾蛇乘雾，终为土灰。\n" +
                "                                                                                     老骥伏枥，志在千里。\n" +
                "                                                                                     烈士暮年，壮心不已。\n" +
                "                                                                                     盈缩之期，不但在天；\n" +
                "                                                                                     养怡之福，可得永年。\n" +
                "                                                                                     幸甚至哉，歌以咏志。");
        poetryList.add(poetry4);
        poetry5.setTitle("冬十月");
        poetry5.setContent("                                                                                     孟冬十月，北风徘徊，\n" +
                "                                                                                     天气肃清，繁霜霏霏。\n" +
                "                                                                                     鵾鸡晨鸣，鸿雁南飞，\n" +
                "                                                                                     鸷鸟潜藏，熊罴窟栖。\n" +
                "                                                                                     钱镈停置，农收积场，\n" +
                "                                                                                     逆旅整设，以通贾商。\n" +
                "                                                                                     幸甚至哉！歌以咏志。\n");
        poetryList.add(poetry5);
        poetry6.setTitle("关雎");
        poetry6.setContent("                                                                 关关雎鸠，在河之洲。窈窕淑女，君子好逑。\n" +
                "                                                                 参差荇菜，左右流之。窈窕淑女，寤寐求之。\n" +
                "                                                                 求之不得，寤寐思服。悠哉悠哉，辗转反侧。\n" +
                "                                                                 参差荇菜，左右采之。窈窕淑女，琴瑟友之。\n" +
                "                                                                 参差荇菜，左右芼之。窈窕淑女，钟鼓乐之。");
        poetryList.add(poetry6);
        poetry7.setTitle("樛木");
        poetry7.setContent("                                                                 南有樛木，葛藟累之。乐只君子，福履绥之。\n" +
                "                                                                 南有樛木，葛藟荒之。乐只君子，福履将之。\n" +
                "                                                                 南有樛木，葛藟萦之。乐只君子，福履成之。");
        poetryList.add(poetry7);
        poetry8.setTitle("桃夭");
        poetry8.setContent("                                                                 桃之夭夭，灼灼其华。之子于归，宜其室家。\n" +
                "                                                                 桃之夭夭，有蕡其实。之子于归，宜其家室。\n" +
                "                                                                 桃之夭夭，其叶蓁蓁。之子于归，宜其家人。");
        poetryList.add(poetry8);
        poetry9.setTitle("兔罝");
        poetry9.setContent("                                                                 肃肃兔罝，椓之丁丁。赳赳武夫，公侯干城。\n" +
                "                                                                 肃肃兔罝，施于中逵。赳赳武夫，公侯好仇。\n" +
                "                                                                 肃肃兔罝，施于中林。赳赳武夫，公侯腹心。");
        poetryList.add(poetry9);
        poetry10.setTitle("芣苢");
        poetry10.setContent("                                                                 采采芣苢，薄言采之。采采芣苢，薄言有之。\n" +
                "                                                                 采采芣苢，薄言掇之。采采芣苢，薄言捋之。\n" +
                "                                                                 采采芣苢，薄言袺之。采采芣苢，薄言襭之");
        poetryList.add(poetry10);
        poetry11.setTitle("汉广");
        poetry11.setContent("                                                                 南有乔木，不可休思；汉有游女，不可求思。\n" +
                "                                                                 汉之广矣，不可泳思；江之永矣，不可方思。\n" +
                "                                                                 翘翘错薪，言刈其楚；之子于归，言秣其马。\n" +
                "                                                                 汉之广矣，不可泳思；江之永矣，不可方思。\n" +
                "                                                                 翘翘错薪，言刈其蒌；之子于归，言秣其驹。\n" +
                "                                                                 汉之广矣，不可泳思；江之永矣，不可方思。");
        poetryList.add(poetry11);
        poetry12.setTitle("汝坟");
        poetry12.setContent("                                                                 遵彼汝坟，伐其条枚。未见君子，惄如调饥。\n" +
                "                                                                 遵彼汝坟，伐其条肄。既见君子，不我遐弃。\n" +
                "                                                                 鲂鱼赪尾，王室如毁。虽则如毁，父母孔迩。");
        poetryList.add(poetry12);
        poetry13.setTitle("鹊巢");
        poetry13.setContent("                                                                 维鹊有巢，维鸠居之。之子于归，百两御之。\n" +
                "                                                                 维鹊有巢，维鸠方之。之子于归，百两将之。\n" +
                "                                                                 维鹊有巢，维鸠盈之。之子于归，百两成之。");
        poetryList.add(poetry13);
        poetry14.setTitle("采蘩");
        poetry14.setContent("                                                                 于以采蘩？于沼于沚。于以用之？公侯之事。\n" +
                "                                                                 于以采蘩？于涧之中。于以用之？公侯之宫。\n" +
                "                                                                 被之僮僮，夙夜在公。被之祁祁，薄言还归。");
        poetryList.add(poetry14);
        poetry15.setTitle("采蘋");
        poetry15.setContent("                                                                 于以采蘋？南涧之滨。于以采藻？于彼行潦。\n" +
                "                                                                 于以盛之？维筐及筥。于以湘之？维锜及釜。\n" +
                "                                                                 于以奠之？宗室牖下。谁其尸之？有齐季女。");
        poetryList.add(poetry15);
        poetry16.setTitle("羔羊");
        poetry16.setContent("                                                                 羔羊之皮，素丝五紽。退食自公，委蛇委蛇。\n" +
                "                                                                 羔羊之革，素丝五緎。委蛇委蛇，自公退食。\n" +
                "                                                                 羔羊之缝，素丝五总。委蛇委蛇，退食自公。");
        poetryList.add(poetry16);
        poetry17.setTitle("何彼襛矣");
        poetry17.setContent("                                                                 何彼襛矣，唐棣之华？曷不肃雝？王姬之车。\n" +
                "                                                                 何彼襛矣，华如桃李？平王之孙，齐侯之子。\n" +
                "                                                                 其钓维何？维丝伊缗。齐侯之子，平王之孙。");
        poetryList.add(poetry17);
        poetry18.setTitle("绿衣");
        poetry18.setContent("                                                                 绿兮衣兮，绿衣黄里。心之忧矣，曷维其已？\n" +
                "                                                                 绿兮衣兮，绿衣黄裳。心之忧矣，曷维其亡？\n" +
                "                                                                 绿兮丝兮，女所治兮。我思古人，俾无訧兮。\n" +
                "                                                                 絺兮绤兮，凄其以风。我思古人，实获我心。");
        poetryList.add(poetry18);
        poetry19.setTitle("终风");
        poetry19.setContent("                                                                 终风且暴，顾我则笑。谑浪笑敖，中心是悼。\n" +
                "                                                                 终风且霾，惠然肯来。莫往莫来，悠悠我思。\n" +
                "                                                                 终风且曀，不日有曀。寤言不寐，愿言则嚏。\n" +
                "                                                                 曀曀其阴，虺虺其雷。寤言不寐，愿言则怀。");
        poetryList.add(poetry19);
        poetry20.setTitle("击鼓");
        poetry20.setContent("                                                                 击鼓其镗，踊跃用兵。土国城漕，我独南行。\n" +
                "                                                                 从孙子仲，平陈与宋。不我以归，忧心有忡。\n" +
                "                                                                 爰居爰处？爰丧其马？于以求之？于林之下。\n" +
                "                                                                 死生契阔，与子成说。执子之手，与子偕老。\n" +
                "                                                                 于嗟阔兮，不我活兮。于嗟洵兮，不我信兮。");
        poetryList.add(poetry20);
        return poetryList;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        isTwoPane= getActivity().findViewById(R.id.poetry_content_layout) != null;
    }

    class PoetryAdapter extends RecyclerView.Adapter<PoetryAdapter.ViewHolder> {
        private List<Poetry> poetryList;

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView poetryTitleText;

            public ViewHolder(View view) {
                super(view);
                poetryTitleText = (TextView) view.findViewById(R.id.poetry_title);
            }
        }

        public PoetryAdapter(List<Poetry> _poetryList) {
            poetryList = _poetryList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poetry_item, parent, false);
            final ViewHolder viewHolder = new ViewHolder(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Poetry poetry = poetryList.get(viewHolder.getAdapterPosition());
                    if (isTwoPane) {
                        PoetryContentFragment poetryContentFragment = (PoetryContentFragment) getFragmentManager().findFragmentById(R.id.poetry_content_fragment);
                        poetryContentFragment.refresh(poetry.getTitle(), poetry.getContent());
                    } else {
                        PoetryContentActivity.actionStart(getActivity(), poetry.getTitle(), poetry.getContent());
                    }
                }
            });
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Poetry poetry = poetryList.get(position);
            holder.poetryTitleText.setText(poetry.getTitle());
        }

        @Override
        public int getItemCount() {
            return poetryList.size();
        }
    }
}
