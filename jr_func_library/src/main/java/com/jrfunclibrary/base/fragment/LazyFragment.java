�}"* 
 n  �Z����3~�9&	��9+��i)c������G���y������t�6���;��W7r?�0&���=�iux<.�x�EPU�������P`���S�̨q�_*�^J!�]��z�~j�ޝ�O�<�+N���=^�l��ڶ��[f)���\��4'4���x���#�(�1�G�ͣ�J`��)�_�g��������ܴ/�����x0�4�n���cD�p��~Gt.�����ST����i�إ��O�
N��q�L�1@���rA�J�,�\�����@��G�� ��"O��"�|�m�Iq���:� �H�H}mq�mB۠p��΀/$V4]#a*3C;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;      onVisible();
        } else {
            isVisible = false;
            onInvisible();
        }
    }
    protected void onVisible(){
        lazyLoad();
    }
    protected abstract void lazyLoad();
    protected  void unlazyLoad(){};
    protected void onInvisible(){
        unlazyLoad();
    }


    public void sendNews(){

    }
}
