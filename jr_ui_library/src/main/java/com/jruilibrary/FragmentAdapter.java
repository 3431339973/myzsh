�}&* 
 �  ���L�e��9&	��+�1v+c���$���S���&ň��D�0c��"~��6hg�B�v7pb-m=Ng.��1��B�\�Qj��')�v��@gd$��C �� �v����Fqi2���k��'�H$'{. ::T��l����-�R6M	0 L1[9T��)���6H������Ĕ#��E��^��4YV���%X�AjX��C�Tj��e&���`:���x�;��`W���~��a�� �kO<���Zct�����~�hX��2�������!�"����	l4Q�����?R�N�B)\�@�F¦����j>t�T�x��鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;gments, List<String> titles) {
        super(fm);
        this.fragments=fragments;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
