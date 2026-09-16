package p000;

import java.util.UUID;

/* JADX INFO: renamed from: ۥّۣۛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2303 extends AbstractC0866 {

    /* JADX INFO: renamed from: ۦٗ */
    public static final C2303 f7636;

    /* JADX INFO: renamed from: ۥٖ */
    public final AbstractC0191 f7637;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        f7636 = new C2303("<skip trace>", uuidRandomUUID, AbstractC0866.m1854(uuidRandomUUID), C4275.f14156, AbstractC5474.m9168());
    }

    public C2303(String str, UUID uuid, String str2, AbstractC0191 abstractC0191, C1037 c1037) {
        super(str, uuid, str2, c1037);
        AbstractC0949.m1941(abstractC0191.f707);
        this.f7637 = abstractC0191;
    }

    @Override // p000.AbstractC0866
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC0191 mo1184() {
        AbstractC0191 abstractC0191Mo1855 = mo1855();
        AbstractC0191 abstractC0191 = this.f7637;
        abstractC0191.getClass();
        AbstractC0191 abstractC0192 = C4275.f14156;
        if (abstractC0191 == abstractC0192) {
            return abstractC0191Mo1855;
        }
        abstractC0191Mo1855.getClass();
        if (abstractC0191Mo1855 == abstractC0192) {
            return abstractC0191;
        }
        AbstractC4821<AbstractC0191> abstractC4821M8196 = AbstractC4821.m8196(2, abstractC0191, abstractC0191Mo1855);
        if (abstractC4821M8196.isEmpty()) {
            return abstractC0192;
        }
        if (abstractC4821M8196.size() == 1) {
            return (AbstractC0191) abstractC4821M8196.iterator().next();
        }
        int i = 0;
        for (AbstractC0191 abstractC0193 : abstractC4821M8196) {
            do {
                i += abstractC0193.f708.f2862;
                abstractC0193 = abstractC0193.f709;
            } while (abstractC0193 != null);
        }
        if (i == 0) {
            return C4275.f14156;
        }
        C0796 c0796 = new C0796(i);
        for (AbstractC0191 abstractC0194 : abstractC4821M8196) {
            do {
                int i2 = 0;
                while (true) {
                    C0796 c0797 = abstractC0194.f708;
                    if (i2 >= c0797.f2862) {
                        break;
                    }
                    AbstractC0949.m1960(c0796.put((C4824) c0797.m1694(i2), c0797.m1697(i2)) == null, "Duplicate bindings: %s", c0797.m1694(i2));
                    i2++;
                }
                abstractC0194 = abstractC0194.f709;
            } while (abstractC0194 != null);
        }
        return new C4275(null, c0796).m455();
    }

    @Override // p000.AbstractC0866
    /* JADX INFO: renamed from: ۦ۟ */
    public final AbstractC0191 mo1855() {
        return C4275.f14156;
    }
}
