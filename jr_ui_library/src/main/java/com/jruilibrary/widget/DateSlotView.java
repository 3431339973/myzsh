�}* 
 �  
��	����9&	��3+�ɷ�bܤ�����_��)���V�Y�unM�"����t�R�FDh�S��-�R���Z�i�&�5��M��&&c�3h$8`��P��X�K��L�{ t����������abӡ*#��SE'U�٤K<iR��z��B�����[��CV�5}��\:�!a�Jj��l�ʕ�3���d���1�"�!`�B g
&�\�����Ǚ�%��B�4��sVD��; I��@�-:9~���/}U��Y�_ wϞ��8���c#�}I��&��<���������4�~���w�����Λ�鉦�}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;l�$�6k�9m��S��
��4@�řdI��G�D�_~4O�o_�)�cꟂ�{�*ɷZ��oH`D��]o.H��;��`�8�b�����@��G��Ӹ<�I)��Ύ��p@�e��Jf�&I�c4�u���GD`@�ܡ?vA��&й��e�'1N%Ӂ)�#�k���ˮg'%>8���ő��o��|뙁��ͨ'@���^K_�@�s1Gz]�4o,���E��#�G���15{�&C����V�-:��j�vI�/s�3S��~��戴�{�����+*��\4
�d`L��6�l�G�ea�r��7oM��_^�:����׺Y�&l=m���*ND��]?�va���R�ް�k߸�myܬ�jFPq�d���f�s��Ox'����G�
�\\��ٕP`֮{�߲���:M�e�=��3�Z�<��a�*��!�����V.2w!������<
8�n���j��7``�H�r�$S�0gO�:�c�3Ĵ�jd���-����z0���>G);
        endTimeText.setDate(new Date());
        startTimeText.setDate(new Date(System.currentTimeMillis()-(60*1000*60*24*7))); //开始时间前7天

    }

    /**
     * 获取开始时间
     * @return
     */
    public String getStartTime(){
        return startTimeText.getText()+"";
    }

    /**
     * 获取结束时间
     * @return
     */
    public String getEndTime(){
        return endTimeText.getText()+"";
    }
}
