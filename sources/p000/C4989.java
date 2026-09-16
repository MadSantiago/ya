package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ۦؘؚۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4989 extends AbstractC0318 {
    private static final C4989 DEFAULT_INSTANCE;
    private static volatile InterfaceC5878 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C0303 preferences_ = C0303.f1094;

    static {
        C4989 c4989 = new C4989();
        DEFAULT_INSTANCE = c4989;
        AbstractC0318.m673(C4989.class, c4989);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static C0344 m8374() {
        return (C0344) ((AbstractC0180) DEFAULT_INSTANCE.mo674(5));
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C4989 m8375(FileInputStream fileInputStream) {
        C4989 c4989 = DEFAULT_INSTANCE;
        C5778 c5778 = new C5778(fileInputStream);
        C2336 c2336M4376 = C2336.m4376();
        AbstractC0318 abstractC0318M678 = c4989.m678();
        try {
            C5734 c5734 = C5734.f18904;
            c5734.getClass();
            InterfaceC1622 interfaceC1622M9541 = c5734.m9541(abstractC0318M678.getClass());
            C4902 c4902 = (C4902) c5778.f9135;
            if (c4902 == null) {
                c4902 = new C4902(c5778);
            }
            interfaceC1622M9541.mo3392(abstractC0318M678, c4902, c2336M4376);
            interfaceC1622M9541.mo3387(abstractC0318M678);
            if (AbstractC0318.m671(abstractC0318M678, true)) {
                return (C4989) abstractC0318M678;
            }
            throw new C3406(new C2686().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof C3406) {
                throw ((C3406) e.getCause());
            }
            throw new C3406(e.getMessage(), e);
        } catch (C2686 e2) {
            throw new C3406(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C3406) {
                throw ((C3406) e3.getCause());
            }
            throw e3;
        } catch (C3406 e4) {
            if (e4.f11336) {
                throw new C3406(e4.getMessage(), e4);
            }
            throw e4;
        }
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
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4022(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0440.f1621});
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C4989();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C0344(DEFAULT_INSTANCE);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC5878 interfaceC5878 = PARSER;
                if (interfaceC5878 != null) {
                    return interfaceC5878;
                }
                synchronized (C4989.class) {
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

    /* JADX INFO: renamed from: ۦؚ */
    public final Map m8376() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final C0303 m8377() {
        C0303 c0303 = this.preferences_;
        if (c0303.f1095) {
            return c0303;
        }
        C0303 c0303M633 = c0303.m633();
        this.preferences_ = c0303M633;
        return c0303M633;
    }
}
