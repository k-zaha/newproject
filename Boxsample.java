class BoxSample {
    public static void main(String[] args){

        /* ���b�p�[�N���X�ƁA�v���~�e�B�u�^�f�[�^�̎����ϊ��ɂ���
            �v���~�e�B�u�^�̃f�[�^(boolean char byte short int Long float double)�ɂ́A
            ���̃f�[�^�ɕt�����āA���\�b�h���g�p�ł���A���b�p�[�N���X�Ƃ����N���X������B
           -- �Ή����郉�b�p�[�N���X --
             boolean == Boolean
             char == Character
             byte == Byte
             short == Short
             int == Integer
             long == Long
             float == Float
             double == Double
           --------------------------

           �ʏ�A�^�ϊ����s���ۂ́A�^�L���X�g���w�肵�Ȃ��Ƃ����Ȃ����A
           �v���~�e�B�u�^�@??�@���b�p�[�@�̕ϊ��Ɋւ��ẮA���ꍞ�ރ��\�b�h�̎w�肷��f�[�^�^���ɉ�����
           �����I�ɕϊ����s���Ă����B

           �v���~�e�B�u�@?�@���b�p�[�@�ւ̕ϊ���Auto-Boxing�A
           ���b�p�[�@?�@�v���~�e�B�u�@�ւ̕ϊ���Auto-Unboxing�Ƃ����B
        */


        //prim_int�́Aint�^�̕ϐ������AInteger�̃I�u�W�F�N�g����ꍞ�ނ��Ƃ��ł���B
        //���b�p�[����A�v���~�e�B�u�^�Ɏ����ϊ�����邽�߁AAuto-unboxing
        int prim_int = new Integer(10);
        System.out.println("�l�F" + prim_int);

        //wrap_Int��Integer�N���X�^�����Aint�^�̃f�[�^����ꍞ�ނ��Ƃ��ł���B
        //�v���~�e�B�u����A���b�p�[�N���X�^�Ɏ����ϊ������ׁAAuto-boxing
        Integer wrap_Int = prim_int * 10;
        System.out.println("�l�F" + wrap_Int);
    }
}