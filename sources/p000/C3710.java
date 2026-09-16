package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: ۦٌؒۗٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3710 extends AbstractC0318 {
    private static final C3710 DEFAULT_INSTANCE;
    private static volatile InterfaceC5878 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC4997 strings_ = C2645.f8788;

    static {
        C3710 c3710 = new C3710();
        DEFAULT_INSTANCE = c3710;
        AbstractC0318.m673(C3710.class, c3710);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static C3710 m6567() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static C3604 m6568() {
        return (C3604) ((AbstractC0180) DEFAULT_INSTANCE.mo674(5));
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
                return new C4022(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C3710();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new C3604(DEFAULT_INSTANCE);
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC5878 interfaceC5878 = PARSER;
                if (interfaceC5878 != null) {
                    return interfaceC5878;
                }
                synchronized (C3710.class) {
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
    public final void m6569(Iterable iterable) {
        InterfaceC4997 interfaceC4997M4958 = this.strings_;
        if (!((C2645) interfaceC4997M4958).f8791) {
            C2645 c2645 = (C2645) interfaceC4997M4958;
            int i = c2645.f8789;
            interfaceC4997M4958 = c2645.m4958(i == 0 ? 10 : i * 2);
            this.strings_ = interfaceC4997M4958;
        }
        Charset charset = AbstractC3576.f11899;
        if (iterable instanceof InterfaceC3888) {
            ((InterfaceC3888) iterable).m6972();
            C0178.m382();
            return;
        }
        if (iterable instanceof InterfaceC2802) {
            ((C2645) interfaceC4997M4958).addAll((Collection) iterable);
            return;
        }
        if ((interfaceC4997M4958 instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) interfaceC4997M4958).ensureCapacity(((Collection) iterable).size() + ((C2645) interfaceC4997M4958).f8789);
        }
        C2645 c2646 = (C2645) interfaceC4997M4958;
        int i2 = c2646.f8789;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (c2646.f8789 - i2) + " is null.";
                for (int i3 = c2646.f8789 - 1; i3 >= i2; i3--) {
                    c2646.remove(i3);
                }
                C0178.m387(str);
                return;
            }
            c2646.add(obj);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC4997 m6570() {
        return this.strings_;
    }
}
