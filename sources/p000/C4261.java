package p000;

/* JADX INFO: renamed from: ۦٕؗؗٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4261 extends AbstractC0318 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C4261 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC5878 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C4261 c4261 = new C4261();
        DEFAULT_INSTANCE = c4261;
        AbstractC0318.m673(C4261.class, c4261);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static C4261 m7539() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static C1579 m7540() {
        return (C1579) ((AbstractC0180) DEFAULT_INSTANCE.mo674(5));
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final void m7541(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m7542(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }

    @Override // p000.AbstractC0318
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo674(int i) {
        InterfaceC5878 c1430;
        switch (AbstractC3761.m6632(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new C4022(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C3710.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new C4261();
            case LONG_FIELD_NUMBER /* 4 */:
                return new C1579(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC5878 interfaceC5878 = PARSER;
                if (interfaceC5878 != null) {
                    return interfaceC5878;
                }
                synchronized (C4261.class) {
                    try {
                        c1430 = PARSER;
                        if (c1430 == null) {
                            c1430 = new C1430();
                            PARSER = c1430;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1430;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m7543(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final String m7544() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: ۥْ */
    public final int m7545() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final long m7546() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final C3710 m7547() {
        return this.valueCase_ == 6 ? (C3710) this.value_ : C3710.m6567();
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m7548(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m7549(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m7550(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m7551() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C0533 m7552() {
        return this.valueCase_ == 8 ? (C0533) this.value_ : C0533.f1874;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m7553(C0533 c0533) {
        this.valueCase_ = 8;
        this.value_ = c0533;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final int m7554() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m7555(C3710 c3710) {
        this.value_ = c3710;
        this.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final float m7556() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final double m7557() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
