�}q* 
 �  *f)�&��9&	��U+��v+Gݤ��R�������eݾ��h���� ��{�[c�A�����0�g�=['�������y�|}�]8C��i;"u���ٺ�:V�\GU�!T�Sz�fL��`Q�4�����2�SrY�cπ�z��vq3����x��}qQ������χ%��J���b<�V��)#V����9���l��CSN&��Tھ����Ќ�ۙ���
��xLo��2�a�y���h�7����a�,�����h�/��lnz��[Զ��7:R�~@7��mi�S
˹���c�[~�n�7b6�9���fM�M����k�b�ghA�.*�WL�
�:l��!~���;��)$x��l�y��֜���2N���+M����]�oGo��HvD�$d���b��9.�y��ϰ6���m�9`�F V�2��{uG~F����;��ڢ�.�ޢ32��\�L�#���-���#ׁ��j�)7T���b�$�g�;lD&�{�f������=��<ߣ�mdJPg���`o�p"j\2\�T�@E�C��M�Y�<0��z|���O�N�2�f��O&B\����-M�!y�Sc�*D���X���0:��C��Z�#
K�
�:nد����U���B�̥��c(��E�sb4�@d_R�rb�0�7�Q���`yX�+�/�Eׁ�J�����˯#�J��J�i�CgU@@K��-*\�y6"n�{5z�֍�x��#�2�A�Y�j'� HW�~���/S��_]q�<�|1��Ψl��ͳ�x��}���W�כ����aH��tczޫ� q�Q>j�U��Z�2--���s^Z�D���{h����|�(�����͋mҠ�:A�񼳍N�5y A~Wa����08�(����j g"n�`���71�9�V�ȉ�b��-?��5ԄO�r�����Go�S�ha�_����[�dơ{��򍶤j���7ۘ���-�������]D��7�)�#�J� �i�9nge it into
	 * real as column type.
	 */
	@Override
	public String object2Relation(String fieldType) {
		if (fieldType != null) {
			if (fieldType.equals("float") || fieldType.equals("java.lang.Float")) {
				return "real";
			}
			if (fieldType.equals("double") || fieldType.equals("java.lang.Double")) {
				return "real";
			}
		}
		return null;
	}

}
