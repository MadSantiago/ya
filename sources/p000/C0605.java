package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ۥؗؕؖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0605 implements InterfaceC1263, InterfaceC3979, InterfaceC4576 {

    /* JADX INFO: renamed from: ۥۢ */
    public static final C4674 f2232 = new C4674(1, "Undefined intrinsics block and it is required");

    /* JADX INFO: renamed from: ۦ */
    public static final C5158 f2233 = new C5158();

    /* JADX INFO: renamed from: ۦٝ */
    public static final C1068 f2234 = new C1068(7);

    /* JADX INFO: renamed from: ۥؓ */
    public C0605 f2235;

    /* JADX INFO: renamed from: ۥؔ */
    public InterfaceC2880 f2236;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f2237;

    /* JADX INFO: renamed from: ۥؙ */
    public InterfaceC0705 f2238;

    /* JADX INFO: renamed from: ۥؚ */
    public boolean f2239;

    /* JADX INFO: renamed from: ۥً */
    public C4855 f2240;

    /* JADX INFO: renamed from: ۥَ */
    public boolean f2241;

    /* JADX INFO: renamed from: ۥِ */
    public boolean f2242;

    /* JADX INFO: renamed from: ۥْ */
    public boolean f2243;

    /* JADX INFO: renamed from: ۥٓ */
    public long f2244;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f2245;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f2246;

    /* JADX INFO: renamed from: ۥ٘ */
    public InterfaceC3595 f2247;

    /* JADX INFO: renamed from: ۥٙ */
    public C0863 f2248;

    /* JADX INFO: renamed from: ۥٛ */
    public boolean f2249;

    /* JADX INFO: renamed from: ۥٝ */
    public C0851 f2250;

    /* JADX INFO: renamed from: ۥۖ */
    public int f2251;

    /* JADX INFO: renamed from: ۥۘ */
    public int f2252;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f2253;

    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC1311 f2254;

    /* JADX INFO: renamed from: ۥۡ */
    public InterfaceC0705 f2255;

    /* JADX INFO: renamed from: ۥۤ */
    public final C2457 f2256;

    /* JADX INFO: renamed from: ۥۥ */
    public C5157 f2257;

    /* JADX INFO: renamed from: ۥۦ */
    public final C0863 f2258;

    /* JADX INFO: renamed from: ۥۧ */
    public InterfaceC2043 f2259;

    /* JADX INFO: renamed from: ۥۨ */
    public boolean f2260;

    /* JADX INFO: renamed from: ۦؒ */
    public final C1233 f2261;

    /* JADX INFO: renamed from: ۦؔ */
    public int f2262;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f2263;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f2264;

    /* JADX INFO: renamed from: ۦؙ */
    public C2542 f2265;

    /* JADX INFO: renamed from: ۦُ */
    public InterfaceC3228 f2266;

    /* JADX INFO: renamed from: ۦٕ */
    public final C3369 f2267;

    /* JADX INFO: renamed from: ۦٖ */
    public C3369 f2268;

    /* JADX INFO: renamed from: ۦٗ */
    public boolean f2269;

    /* JADX INFO: renamed from: ۦٚ */
    public int f2270;

    /* JADX INFO: renamed from: ۦۛ */
    public C0605 f2271;

    /* JADX INFO: renamed from: ۦۜ */
    public EnumC2459 f2272;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f2273;

    /* JADX INFO: renamed from: ۦ۠ */
    public int f2274;

    /* JADX INFO: renamed from: ۦۣ */
    public InterfaceC2509 f2275;

    /* JADX INFO: renamed from: ۦۧ */
    public C5625 f2276;

    /* JADX INFO: renamed from: ۦۨ */
    public final boolean f2277;

    public C0605(int i, boolean z) {
        this.f2277 = z;
        this.f2273 = i;
        this.f2244 = 9223372034707292159L;
        this.f2241 = true;
        this.f2246 = true;
        this.f2267 = new C3369(16, new C0863(new C0605[16]), new C5285(12, this));
        this.f2258 = new C0863(new C0605[16]);
        this.f2264 = true;
        this.f2266 = f2232;
        this.f2236 = AbstractC5359.f17636;
        this.f2272 = EnumC2459.f8215;
        this.f2275 = f2233;
        InterfaceC3595.f11952.getClass();
        this.f2247 = C4955.f16389;
        this.f2252 = 3;
        this.f2262 = 3;
        this.f2256 = new C2457(this);
        this.f2261 = new C1233(this);
        this.f2239 = true;
        this.f2238 = C4217.f13994;
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static void m1311(C0605 c0605) {
        int i = AbstractC0473.f1721[AbstractC3761.m6632(c0605.f2261.f4244)];
        C1233 c1233 = c0605.f2261;
        if (i != 1) {
            C1078.m2276("Unexpected state ".concat(AbstractC5078.m8682(c1233.f4244)));
            return;
        }
        if (c1233.f4238) {
            m1313(c0605, true, 6);
            return;
        }
        if (c1233.f4239) {
            c0605.m1346(true);
        }
        if (c0605.m1324()) {
            m1312(c0605, true, 6);
        } else if (c0605.m1364()) {
            c0605.m1336(true);
        }
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static void m1312(C0605 c0605, boolean z, int i) {
        InterfaceC2043 interfaceC2043;
        C0605 c0605M1356;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (c0605.f2245 || c0605.f2277 || (interfaceC2043 = c0605.f2259) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1786(c0605, false, z, z2);
        if (z3) {
            C1233 c1233 = c0605.f2261.f4252.f7752;
            C0605 c0605M1357 = c1233.f4243.m1356();
            int i2 = c1233.f4243.f2252;
            if (c0605M1357 == null || i2 == 3) {
                return;
            }
            while (c0605M1357.f2252 == i2 && (c0605M1356 = c0605M1357.m1356()) != null) {
                c0605M1357 = c0605M1356;
            }
            int iM6632 = AbstractC3761.m6632(i2);
            if (iM6632 == 0) {
                m1312(c0605M1357, z, 6);
            } else if (iM6632 == 1) {
                c0605M1357.m1336(z);
            } else {
                C1078.m2276("Intrinsics isn't used by the parent");
            }
        }
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static void m1313(C0605 c0605, boolean z, int i) {
        C0605 c0605M1356;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (c0605.f2271 == null) {
            AbstractC3480.m6278("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        InterfaceC2043 interfaceC2043 = c0605.f2259;
        if (interfaceC2043 == null || c0605.f2245 || c0605.f2277) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1786(c0605, true, z, z2);
        if (z3) {
            C1233 c1233 = c0605.f2261.f4240.f9804;
            C0605 c0605M1357 = c1233.f4243.m1356();
            int i2 = c1233.f4243.f2252;
            if (c0605M1357 == null || i2 == 3) {
                return;
            }
            while (c0605M1357.f2252 == i2 && (c0605M1356 = c0605M1357.m1356()) != null) {
                c0605M1357 = c0605M1356;
            }
            int iM6632 = AbstractC3761.m6632(i2);
            if (iM6632 == 0) {
                if (c0605M1357.f2271 != null) {
                    m1313(c0605M1357, z, 6);
                    return;
                } else {
                    m1312(c0605M1357, z, 6);
                    return;
                }
            }
            if (iM6632 != 1) {
                C1078.m2276("Intrinsics isn't used by the parent");
            } else if (c0605M1357.f2271 != null) {
                c0605M1357.m1346(z);
            } else {
                c0605M1357.m1336(z);
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    private final String m1314(C0605 c0605) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(c0605);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(m1321(0));
        sb.append(" Other tree: ");
        C0605 c0606 = c0605.f2235;
        sb.append(c0606 != null ? c0606.m1321(0) : null);
        return sb.toString();
    }

    public final String toString() {
        return AbstractC2774.m5181(this) + " children: " + ((C0863) ((C3482) m1361()).f11560).f3180 + " measurePolicy: " + this.f2266 + " deactivated: " + this.f2242;
    }

    @Override // p000.InterfaceC3979
    /* JADX INFO: renamed from: ۥؓ */
    public final boolean mo1315() {
        return m1348();
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final void m1316(C0605 c0605) {
        if (c0605.f2261.f4245 > 0) {
            C1233 c1233 = this.f2261;
            c1233.m2604(c1233.f4245 - 1);
        }
        if (this.f2259 != null) {
            c0605.m1360();
        }
        c0605.f2235 = null;
        if (c0605.f2274 > 0) {
            m1344(this.f2274 - 1);
        }
        ((AbstractC1311) c0605.f2256.f8201).f4514 = null;
        if (c0605.f2277) {
            this.f2251--;
            C0863 c0863 = (C0863) c0605.f2267.f11255;
            Object[] objArr = c0863.f3182;
            int i = c0863.f3180;
            for (int i2 = 0; i2 < i; i2++) {
                ((AbstractC1311) ((C0605) objArr[i2]).f2256.f8201).f4514 = null;
            }
        }
        m1350();
        m1366();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m1317(long j, C0679 c0679, int i, boolean z) {
        C2457 c2457 = this.f2256;
        AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
        C1117 c1117 = AbstractC1311.f4507;
        ((AbstractC1311) c2457.f8201).m9776(AbstractC1311.f4506, abstractC1311.m2776(j), c0679, i, z);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m1318() {
        this.f2262 = this.f2252;
        this.f2252 = 3;
        C0863 c0863M1329 = m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0605 = (C0605) objArr[i2];
            if (c0605.f2252 != 3) {
                c0605.m1318();
            }
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m1319() {
        if (this.f2239) {
            C2457 c2457 = this.f2256;
            AbstractC1311 abstractC1311 = (C2935) c2457.f8206;
            AbstractC1311 abstractC1312 = ((AbstractC1311) c2457.f8201).f4514;
            this.f2254 = null;
            while (!AbstractC3831.m6874(abstractC1311, abstractC1312)) {
                if ((abstractC1311 != null ? abstractC1311.f4522 : null) != null) {
                    this.f2254 = abstractC1311;
                    break;
                }
                abstractC1311 = abstractC1311 != null ? abstractC1311.f4514 : null;
            }
            this.f2239 = false;
        }
        AbstractC1311 abstractC1313 = this.f2254;
        if (abstractC1313 != null && abstractC1313.f4522 == null) {
            throw AbstractC3761.m6633("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (abstractC1313 != null) {
            abstractC1313.m9779();
            return;
        }
        C0605 c0605M1356 = m1356();
        if (c0605M1356 != null) {
            c0605M1356.m1319();
            return;
        }
        InterfaceC2043 interfaceC2043 = this.f2259;
        if (interfaceC2043 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).invalidate();
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final int m1320() {
        int i;
        C2921 c2921 = this.f2261.f4240;
        if (c2921 == null || (i = c2921.f9815) == 0) {
            return 3;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m1321(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        C0863 c0863M1329 = m1329();
        Object[] objArr = c0863M1329.f3182;
        int i3 = c0863M1329.f3180;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((C0605) objArr[i4]).m1321(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m1322(InterfaceC3228 interfaceC3228) {
        if (AbstractC3831.m6874(this.f2266, interfaceC3228)) {
            return;
        }
        this.f2266 = interfaceC3228;
        C3369 c3369 = this.f2268;
        if (c3369 != null) {
            ((C4852) c3369.f11254).setValue(interfaceC3228);
        }
        m1326();
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ۥّ */
    public final void mo1323() {
        C4855 c4855 = this.f2240;
        if (c4855 != null) {
            c4855.mo1323();
        }
        C0851 c0851 = this.f2250;
        if (c0851 != null) {
            c0851.mo1323();
        }
        C2457 c2457 = this.f2256;
        AbstractC1311 abstractC1311 = ((C2935) c2457.f8206).f4530;
        for (AbstractC1311 abstractC1312 = (AbstractC1311) c2457.f8201; !AbstractC3831.m6874(abstractC1312, abstractC1311) && abstractC1312 != null; abstractC1312 = abstractC1312.f4530) {
            abstractC1312.m9783();
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public final boolean m1324() {
        return this.f2261.f4252.f7765;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final int m1325() {
        return this.f2261.f4252.f7776;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m1326() {
        if (this.f2277) {
            C0605 c0605M1356 = m1356();
            if (c0605M1356 != null) {
                c0605M1356.m1326();
                return;
            }
            return;
        }
        if (this.f2271 != null) {
            m1313(this, false, 7);
        } else {
            m1312(this, false, 7);
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final C3369 m1327() {
        C3369 c3369 = this.f2268;
        if (c3369 != null) {
            return c3369;
        }
        C3369 c33610 = new C3369(this, this.f2266);
        this.f2268 = c33610;
        return c33610;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m1328() {
        C3369 c3369 = this.f2267;
        int i = ((C0863) c3369.f11255).f3180;
        while (true) {
            i--;
            C0863 c0863 = (C0863) c3369.f11255;
            if (-1 >= i) {
                c0863.m1851();
                ((C5285) c3369.f11254).mo449();
                return;
            }
            m1316((C0605) c0863.f3182[i]);
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final C0863 m1329() {
        m1338();
        return this.f2251 == 0 ? (C0863) this.f2267.f11255 : this.f2248;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final void m1330(int i, int i2) {
        if (i2 < 0) {
            AbstractC3480.m6279("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            C3369 c3369 = this.f2267;
            m1316((C0605) ((C0863) c3369.f11255).f3182[i3]);
            Object objM1850 = ((C0863) c3369.f11255).m1850(i3);
            ((C5285) c3369.f11254).mo449();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final C2542 m1331() {
        if (m1348() && !this.f2242 && this.f2256.m4585(8)) {
            return this.f2265;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m1332(InterfaceC2043 interfaceC2043) {
        C0605 c0605;
        C2542 c2542M1331;
        if (this.f2259 != null) {
            AbstractC3480.m6278("Cannot attach " + this + " as it already is attached.  Tree: " + m1321(0));
        }
        C0605 c0606 = this.f2235;
        if (c0606 != null && !AbstractC3831.m6874(c0606.f2259, interfaceC2043)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(interfaceC2043);
            sb.append(") than the parent's owner(");
            C0605 c0605M1356 = m1356();
            sb.append(c0605M1356 != null ? c0605M1356.f2259 : null);
            sb.append("). This tree: ");
            sb.append(m1321(0));
            sb.append(" Parent tree: ");
            C0605 c0607 = this.f2235;
            sb.append(c0607 != null ? c0607.m1321(0) : null);
            AbstractC3480.m6278(sb.toString());
        }
        C0605 c0605M1357 = m1356();
        C1233 c1233 = this.f2261;
        if (c0605M1357 == null) {
            c1233.f4252.f7758 = true;
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).getRectManager().m9136(this);
            C2921 c2921 = c1233.f4240;
            if (c2921 != null) {
                c2921.f9803 = 1;
            }
        }
        C2457 c2457 = this.f2256;
        ((AbstractC1311) c2457.f8201).f4514 = c0605M1357 != null ? (C2935) c0605M1357.f2256.f8206 : null;
        this.f2259 = interfaceC2043;
        this.f2270 = (c0605M1357 != null ? c0605M1357.f2270 : -1) + 1;
        InterfaceC0705 interfaceC0705 = this.f2255;
        if (interfaceC0705 != null) {
            m1339(interfaceC0705);
        }
        this.f2255 = null;
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m9771getLayoutNodes().m8319(this.f2273, this);
        C0605 c0608 = this.f2235;
        if (c0608 == null || (c0605 = c0608.f2271) == null) {
            c0605 = this.f2271;
        }
        m1365(c0605);
        if (this.f2271 == null && c2457.m4585(512)) {
            m1365(this);
        }
        if (!this.f2242) {
            for (AbstractC5381 abstractC5381 = (AbstractC5381) c2457.f8210; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
                abstractC5381.mo5608();
            }
        }
        C0863 c0863 = (C0863) this.f2267.f11255;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0605) objArr[i2]).m1332(interfaceC2043);
        }
        if (!this.f2242) {
            c2457.m4591();
        }
        m1326();
        if (c0605M1357 != null) {
            c0605M1357.m1326();
        }
        C5625 c5625 = this.f2276;
        if (c5625 != null) {
            c5625.mo211(interfaceC2043);
        }
        c1233.m2605();
        if (!this.f2242 && c2457.m4585(8)) {
            m1334();
        }
        C0193 c0193 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).f3131;
        if (c0193 == null || (c2542M1331 = m1331()) == null || !c2542M1331.f8490.m6018(AbstractC2771.f9203)) {
            return;
        }
        c0193.f718.m1032(this.f2273);
        c0193.f720.m5743(c0193.f713, this.f2273, true);
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final void m1333(InterfaceC0705 interfaceC0705) {
        if (this.f2277 && this.f2238 != C4217.f13994) {
            AbstractC3480.m6279("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f2242) {
            AbstractC3480.m6279("modifier is updated when deactivated");
        }
        if (!m1348()) {
            this.f2255 = interfaceC0705;
            return;
        }
        m1339(interfaceC0705);
        if (this.f2253) {
            m1334();
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m1334() {
        if (this.f2263) {
            return;
        }
        if (((C1784) this.f2256.f8200).f17783 != null || this.f2255 != null) {
            this.f2253 = true;
            return;
        }
        C2542 c2542 = this.f2265;
        this.f2263 = true;
        C5450 c5450 = new C5450();
        c5450.f17965 = new C2542();
        C1775 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this)).getSnapshotObserver();
        C5304 c5304 = new C5304(8, this, c5450);
        snapshotObserver.getClass();
        snapshotObserver.f5926.m9077(this, C3948.f13195, c5304);
        this.f2263 = false;
        this.f2265 = (C2542) c5450.f17965;
        this.f2253 = false;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5359.m8951(this);
        viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner().m9198(this, c2542);
        viewTreeObserverOnGlobalLayoutListenerC0850.m1796();
    }

    @Override // p000.InterfaceC1263
    /* JADX INFO: renamed from: ۥۜ */
    public final void mo1335() {
        C0193 c0193;
        C4855 c4855 = this.f2240;
        if (c4855 != null) {
            c4855.mo1335();
        }
        C0851 c0851 = this.f2250;
        if (c0851 != null) {
            c0851.m1809(true);
        }
        this.f2242 = true;
        AbstractC5381 abstractC5381 = (C1850) this.f2256.f8202;
        for (AbstractC5381 abstractC5382 = abstractC5381; abstractC5382 != null; abstractC5382 = abstractC5382.f17780) {
            if (abstractC5382.f17786) {
                abstractC5382.mo5605();
            }
        }
        for (AbstractC5381 abstractC5383 = abstractC5381; abstractC5383 != null; abstractC5383 = abstractC5383.f17780) {
            if (abstractC5383.f17786) {
                abstractC5383.mo5606();
            }
        }
        while (abstractC5381 != null) {
            if (abstractC5381.f17786) {
                abstractC5381.mo5609();
            }
            abstractC5381 = abstractC5381.f17780;
        }
        if (m1348()) {
            this.f2265 = null;
            this.f2253 = false;
        }
        InterfaceC2043 interfaceC2043 = this.f2259;
        if (interfaceC2043 == null || (c0193 = ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).f3131) == null || !c0193.f718.m1030(this.f2273)) {
            return;
        }
        c0193.f720.m5743(c0193.f713, this.f2273, false);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1336(boolean z) {
        InterfaceC2043 interfaceC2043;
        if (this.f2277 || (interfaceC2043 = this.f2259) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1775(this, false, z);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public final void m1337() {
        C0863 c0863M1329 = m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0605 = (C0605) objArr[i2];
            int i3 = c0605.f2262;
            c0605.f2252 = i3;
            if (i3 != 3) {
                c0605.m1337();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۢ */
    public final void m1338() {
        if (this.f2251 <= 0 || !this.f2237) {
            return;
        }
        this.f2237 = false;
        C0863 c0863 = this.f2248;
        if (c0863 == null) {
            c0863 = new C0863(new C0605[16]);
            this.f2248 = c0863;
        }
        c0863.m1851();
        C0863 c0864 = (C0863) this.f2267.f11255;
        Object[] objArr = c0864.f3182;
        int i = c0864.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0605 = (C0605) objArr[i2];
            if (c0605.f2277) {
                c0863.m1840(c0863.f3180, c0605.m1329());
            } else {
                c0863.m1843(c0605);
            }
        }
        C1233 c1233 = this.f2261;
        c1233.f4252.f7746 = true;
        C2921 c2921 = c1233.f4240;
        if (c2921 != null) {
            c2921.f9811 = true;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5611. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۥۣ */
    public final void m1339(p000.InterfaceC0705 r20) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0605.m1339(ۥؙٟؑؔ):void");
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final void m1340() {
        C0605 c0605M1356;
        if (this.f2252 == 3) {
            m1345();
        }
        C2339 c2339 = this.f2261.f4252;
        C1233 c1233 = c2339.f7752;
        try {
            c2339.f7771 = true;
            if (!c2339.f7754) {
                AbstractC3480.m6278("replace called on unplaced item");
            }
            boolean z = c2339.f7758;
            c2339.m4389(c2339.f7745, c2339.f7750, c2339.f7763);
            if (z && !c2339.f7764 && (c0605M1356 = c1233.f4243.m1356()) != null) {
                c0605M1356.m1336(false);
            }
            c2339.f7771 = false;
        } catch (Throwable th) {
            try {
                c1233.f4243.m1367(th);
                throw null;
            } catch (Throwable th2) {
                c2339.f7771 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m1341(InterfaceC2880 interfaceC2880) {
        if (AbstractC3831.m6874(this.f2236, interfaceC2880)) {
            return;
        }
        this.f2236 = interfaceC2880;
        m1326();
        C0605 c0605M1356 = m1356();
        if (c0605M1356 != null) {
            c0605M1356.m1319();
        } else {
            InterfaceC2043 interfaceC2043 = this.f2259;
            if (interfaceC2043 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).invalidate();
            }
        }
        m1357();
        for (AbstractC5381 abstractC5381 = (AbstractC5381) this.f2256.f8210; abstractC5381 != null; abstractC5381 = abstractC5381.f17783) {
            abstractC5381.mo933();
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final boolean m1342() {
        return this.f2261.f4252.f7758;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m1343(int i, C0605 c0605) {
        if (c0605.f2235 != null && c0605.f2259 != null) {
            AbstractC3480.m6278(m1314(c0605));
        }
        c0605.f2235 = this;
        C3369 c3369 = this.f2267;
        ((C0863) c3369.f11255).m1845(i, c0605);
        ((C5285) c3369.f11254).mo449();
        m1366();
        if (c0605.f2277) {
            this.f2251++;
        }
        m1350();
        InterfaceC2043 interfaceC2043 = this.f2259;
        if (interfaceC2043 != null) {
            c0605.m1332(interfaceC2043);
        }
        if (c0605.f2261.f4245 > 0) {
            C1233 c1233 = this.f2261;
            c1233.m2604(c1233.f4245 + 1);
        }
        if (c0605.f2274 > 0) {
            m1344(this.f2274 + 1);
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final void m1344(int i) {
        C0605 c0605M1356;
        C0605 c0605M1357;
        int i2 = this.f2274;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (c0605M1357 = m1356()) != null) {
                c0605M1357.m1344(c0605M1357.f2274 + 1);
            }
            if (i == 0 && this.f2274 > 0 && (c0605M1356 = m1356()) != null) {
                c0605M1356.m1344(c0605M1356.f2274 - 1);
            }
            this.f2274 = i;
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1345() {
        this.f2262 = this.f2252;
        this.f2252 = 3;
        C0863 c0863M1329 = m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0605 = (C0605) objArr[i2];
            if (c0605.f2252 == 2) {
                c0605.m1345();
            }
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final void m1346(boolean z) {
        InterfaceC2043 interfaceC2043;
        if (this.f2277 || (interfaceC2043 = this.f2259) == null) {
            return;
        }
        ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1775(this, true, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ۦٖ۠ؒٔ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [ۥًؗۤ] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX INFO: renamed from: ۦؔ */
    public final void m1347(InterfaceC2509 interfaceC2509) {
        if (AbstractC3831.m6874(this.f2275, interfaceC2509)) {
            return;
        }
        this.f2275 = interfaceC2509;
        AbstractC5381 abstractC5381 = (AbstractC5381) this.f2256.f8210;
        if ((abstractC5381.f17782 & 16) != 0) {
            while (abstractC5381 != null) {
                if ((abstractC5381.f17781 & 16) != 0) {
                    ?? M9233 = abstractC5381;
                    ?? c0863 = 0;
                    while (M9233 != 0) {
                        if (M9233 instanceof InterfaceC2766) {
                            ((InterfaceC2766) M9233).mo4555();
                        } else if ((M9233.f17781 & 16) != 0 && (M9233 instanceof AbstractC3019)) {
                            AbstractC5381 abstractC5382 = ((AbstractC3019) M9233).f10167;
                            int i = 0;
                            M9233 = M9233;
                            c0863 = c0863;
                            while (abstractC5382 != null) {
                                if ((abstractC5382.f17781 & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        c0863 = c0863;
                                        M9233 = abstractC5382;
                                    } else {
                                        if (c0863 == 0) {
                                            c0863 = new C0863(new AbstractC5381[16]);
                                        }
                                        if (M9233 != 0) {
                                            c0863.m1843(M9233);
                                            M9233 = 0;
                                        }
                                        c0863.m1843(abstractC5382);
                                    }
                                }
                                abstractC5382 = abstractC5382.f17783;
                                M9233 = M9233;
                                c0863 = c0863;
                            }
                            if (i == 1) {
                            }
                        }
                        M9233 = AbstractC5537.m9233(c0863);
                    }
                }
                if ((abstractC5381.f17782 & 16) == 0) {
                    return;
                } else {
                    abstractC5381 = abstractC5381.f17783;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final boolean m1348() {
        return this.f2259 != null;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final Boolean m1349() {
        C2921 c2921 = this.f2261.f4240;
        if (c2921 != null) {
            return Boolean.valueOf(c2921.f9803 != 3);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m1350() {
        C0605 c0605;
        if (this.f2251 > 0) {
            this.f2237 = true;
        }
        if (!this.f2277 || (c0605 = this.f2235) == null) {
            return;
        }
        c0605.m1350();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final List m1351() {
        C2921 c2921 = this.f2261.f4240;
        C0863 c0863 = c2921.f9813;
        C1233 c1233 = c2921.f9804;
        c1233.f4243.m1361();
        if (!c2921.f9811) {
            return c0863.m1842();
        }
        C0605 c0605 = c1233.f4243;
        C0863 c0863M1329 = c0605.m1329();
        Object[] objArr = c0863M1329.f3182;
        int i = c0863M1329.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            C0605 c0606 = (C0605) objArr[i2];
            if (c0863.f3180 <= i2) {
                c0863.m1843(c0606.f2261.f4240);
            } else {
                C2921 c2922 = c0606.f2261.f4240;
                Object[] objArr2 = c0863.f3182;
                Object obj = objArr2[i2];
                objArr2[i2] = c2922;
            }
        }
        c0863.m1847(((C0863) ((C3482) c0605.m1361()).f11560).f3180, c0863.f3180);
        c2921.f9811 = false;
        return c0863.m1842();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final List m1352() {
        return this.f2261.f4252.m4386();
    }

    /* JADX INFO: renamed from: ۦُ */
    public final void m1353() {
        C0605 c0605M1356;
        if (this.f2252 == 3) {
            m1345();
        }
        C2921 c2921 = this.f2261.f4240;
        c2921.getClass();
        boolean z = true;
        try {
            c2921.f9817 = true;
            if (!c2921.f9801) {
                AbstractC3480.m6278("replace() called on item that was not placed");
            }
            c2921.f9805 = false;
            if (c2921.f9803 == 3) {
                z = false;
            }
            c2921.m5510(c2921.f9802, c2921.f9818);
            if (z && !c2921.f9805 && (c0605M1356 = c2921.f9804.f4243.m1356()) != null) {
                c0605M1356.m1346(false);
            }
        } finally {
            c2921.f9817 = false;
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final C0863 m1354() {
        boolean z = this.f2264;
        C0863 c0863 = this.f2258;
        if (z) {
            c0863.m1851();
            c0863.m1840(c0863.f3180, m1329());
            Arrays.sort(c0863.f3182, 0, c0863.f3180, f2234);
            this.f2264 = false;
        }
        return c0863;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m1355(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            C3369 c3369 = this.f2267;
            C0863 c0863 = (C0863) c3369.f11255;
            C5285 c5285 = (C5285) c3369.f11254;
            Object objM1850 = c0863.m1850(i5);
            c5285.mo449();
            ((C0863) c3369.f11255).m1845(i6, (C0605) objM1850);
            c5285.mo449();
        }
        m1366();
        m1350();
        m1326();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final C0605 m1356() {
        C0605 c0605 = this.f2235;
        while (c0605 != null && c0605.f2277) {
            c0605 = c0605.f2235;
        }
        return c0605;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m1357() {
        C2457 c2457 = this.f2256;
        AbstractC1311 abstractC1311 = (AbstractC1311) c2457.f8201;
        C2935 c2935 = (C2935) c2457.f8206;
        while (abstractC1311 != c2935) {
            C2355 c2355 = (C2355) abstractC1311;
            InterfaceC4384 interfaceC4384 = c2355.f4522;
            if (interfaceC4384 != null) {
                ((C0281) interfaceC4384).m584();
            }
            abstractC1311 = c2355.f4530;
        }
        InterfaceC4384 interfaceC4385 = c2935.f4522;
        if (interfaceC4385 != null) {
            ((C0281) interfaceC4385).m584();
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m1358(InterfaceC3212 interfaceC3212, C4893 c4893) throws Throwable {
        try {
            ((AbstractC1311) this.f2256.f8201).m2801(interfaceC3212, c4893);
        } catch (Throwable th) {
            m1367(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m1359() {
        if (this.f2271 != null) {
            m1313(this, false, 5);
        } else {
            m1312(this, false, 5);
        }
        C2339 c2339 = this.f2261.f4252;
        C3693 c3693 = c2339.f7769 ? new C3693(c2339.f983) : null;
        InterfaceC2043 interfaceC2043 = this.f2259;
        if (c3693 != null) {
            if (interfaceC2043 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1793(this, c3693.f12325);
            }
        } else if (interfaceC2043 != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).m1781(true);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m1360() {
        C0143 c0143;
        InterfaceC2043 interfaceC2043 = this.f2259;
        if (interfaceC2043 == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            C0605 c0605M1356 = m1356();
            sb.append(c0605M1356 != null ? c0605M1356.m1321(0) : null);
            AbstractC3480.m6277(sb.toString());
            C1078.m2274();
            return;
        }
        C0605 c0605M1357 = m1356();
        C1233 c1233 = this.f2261;
        if (c0605M1357 != null) {
            c0605M1357.m1319();
            c0605M1357.m1326();
            c1233.f4252.f7776 = 3;
            C2921 c2921 = c1233.f4240;
            if (c2921 != null) {
                c2921.f9815 = 3;
            }
        }
        C0143 c0144 = c1233.f4252.f7768;
        c0144.f568 = true;
        c0144.f565 = false;
        c0144.f566 = false;
        c0144.f571 = false;
        c0144.f567 = false;
        c0144.f574 = false;
        c0144.f569 = null;
        C2921 c2922 = c1233.f4240;
        if (c2922 != null && (c0143 = c2922.f9808) != null) {
            c0143.f568 = true;
            c0143.f565 = false;
            c0143.f566 = false;
            c0143.f571 = false;
            c0143.f567 = false;
            c0143.f574 = false;
            c0143.f569 = null;
        }
        C2457 c2457 = this.f2256;
        AbstractC5381 abstractC5381 = (C1850) c2457.f8202;
        AbstractC1311 abstractC1311 = ((C2935) c2457.f8206).f4530;
        for (AbstractC1311 abstractC1312 = (AbstractC1311) c2457.f8201; !AbstractC3831.m6874(abstractC1312, abstractC1311) && abstractC1312 != null; abstractC1312 = abstractC1312.f4530) {
            abstractC1312.m9774();
            if (abstractC1312.f4513.m1342()) {
                abstractC1312.m9796();
            }
        }
        C5157 c5157 = this.f2257;
        if (c5157 != null) {
            c5157.mo211(interfaceC2043);
        }
        for (AbstractC5381 abstractC5382 = abstractC5381; abstractC5382 != null; abstractC5382 = abstractC5382.f17780) {
            if (abstractC5382.f17786) {
                abstractC5382.mo5606();
            }
        }
        this.f2245 = true;
        C0863 c0863 = (C0863) this.f2267.f11255;
        Object[] objArr = c0863.f3182;
        int i = c0863.f3180;
        for (int i2 = 0; i2 < i; i2++) {
            ((C0605) objArr[i2]).m1360();
        }
        this.f2245 = false;
        while (abstractC5381 != null) {
            if (abstractC5381.f17786) {
                abstractC5381.mo5609();
            }
            abstractC5381 = abstractC5381.f17780;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043;
        viewTreeObserverOnGlobalLayoutListenerC0850.m9771getLayoutNodes().m8320(this.f2273);
        C1377 c1377 = viewTreeObserverOnGlobalLayoutListenerC0850.f3125;
        C2808 c2808 = (C2808) c1377.f4712;
        ((C5086) c2808.f9378).m8697(this);
        ((C5086) c2808.f9376).m8697(this);
        ((C5086) c2808.f9377).m8697(this);
        ((C0863) ((C3369) c1377.f4713).f11255).m1848(this);
        viewTreeObserverOnGlobalLayoutListenerC0850.f3069 = true;
        C0193 c0193 = viewTreeObserverOnGlobalLayoutListenerC0850.f3131;
        if (c0193 != null && c0193.f718.m1030(this.f2273)) {
            c0193.f720.m5743(c0193.f713, this.f2273, false);
        }
        viewTreeObserverOnGlobalLayoutListenerC0850.getRectManager().m9141(this);
        this.f2259 = null;
        m1365(null);
        this.f2270 = 0;
        C2339 c2339 = c1233.f4252;
        c2339.f7757 = Integer.MAX_VALUE;
        c2339.f7773 = Integer.MAX_VALUE;
        c2339.f7758 = false;
        C2921 c2923 = c1233.f4240;
        if (c2923 != null) {
            c2923.f9807 = Integer.MAX_VALUE;
            c2923.f9819 = Integer.MAX_VALUE;
            c2923.f9803 = 3;
        }
        if (c2457.m4585(8)) {
            C2542 c2542 = this.f2265;
            this.f2265 = null;
            this.f2253 = false;
            viewTreeObserverOnGlobalLayoutListenerC0850.getSemanticsOwner().m9198(this, c2542);
            viewTreeObserverOnGlobalLayoutListenerC0850.m1796();
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final List m1361() {
        return m1329().m1842();
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final int m1362() {
        return this.f2261.f4252.f7757;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final void m1363(AbstractC1311 abstractC1311) {
        InterfaceC2043 interfaceC2043 = this.f2259;
        C5461 rectManager = interfaceC2043 != null ? ((ViewTreeObserverOnGlobalLayoutListenerC0850) interfaceC2043).getRectManager() : null;
        C1233 c1233 = this.f2261;
        boolean z = c1233.f4244 != 5 || m1324() || m1364();
        if (this.f2269 && rectManager != null) {
            if (abstractC1311 == ((AbstractC1311) this.f2256.f8201)) {
                this.f2246 = true;
                if (!z) {
                    rectManager.m9136(this);
                }
            } else {
                this.f2241 = true;
                C0863 c0863M1329 = m1329();
                Object[] objArr = c0863M1329.f3182;
                int i = c0863M1329.f3180;
                for (int i2 = 0; i2 < i; i2++) {
                    C0605 c0605 = (C0605) objArr[i2];
                    c0605.f2246 = true;
                    if (!z) {
                        rectManager.m9136(c0605);
                    }
                }
                if (this.f2269) {
                    rectManager.f18004 = true;
                    C3510 c3510 = rectManager.f18006;
                    int i3 = this.f2273 & 33554431;
                    long[] jArr = (long[]) c3510.f11621;
                    int i4 = c3510.f11622;
                    for (int i5 = 0; i5 < jArr.length - 2 && i5 < i4; i5 += 3) {
                        int i6 = i5 + 2;
                        long j = jArr[i6];
                        if ((((int) j) & 33554431) == i3) {
                            jArr[i6] = (((j >> 63) & 1) << 60) | j;
                            break;
                        }
                    }
                }
                rectManager.m9140();
            }
        }
        c1233.f4252.m4384();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean m1364() {
        return this.f2261.f4252.f7762;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public final void m1365(C0605 c0605) {
        if (AbstractC3831.m6874(c0605, this.f2271)) {
            return;
        }
        this.f2271 = c0605;
        C1233 c1233 = this.f2261;
        if (c0605 != null) {
            if (c1233.f4240 == null) {
                c1233.f4240 = new C2921(c1233);
            }
            C2457 c2457 = this.f2256;
            AbstractC1311 abstractC1311 = ((C2935) c2457.f8206).f4530;
            for (AbstractC1311 abstractC1312 = (AbstractC1311) c2457.f8201; !AbstractC3831.m6874(abstractC1312, abstractC1311) && abstractC1312 != null; abstractC1312 = abstractC1312.f4530) {
                abstractC1312.mo2786();
            }
        } else {
            c1233.f4240 = null;
            c1233.f4239 = false;
            c1233.f4238 = false;
        }
        m1326();
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m1366() {
        if (!this.f2277) {
            this.f2264 = true;
            return;
        }
        C0605 c0605M1356 = m1356();
        if (c0605M1356 != null) {
            c0605M1356.m1366();
        }
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final void m1367(Throwable th) throws Throwable {
        InterfaceC3595 interfaceC3595 = this.f2247;
        C4216 c4216 = AbstractC2061.f6786;
        C2103 c2103 = (C2103) interfaceC3595;
        c2103.getClass();
        C2805 c2805 = (C2805) C3133.m5778(c2103, c4216);
        if (c2805 == null) {
            throw th;
        }
        AbstractC0487.m1058(th, new C1225(8, c2805, this));
        throw th;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final List m1368() {
        return ((C0863) this.f2267.f11255).m1842();
    }

    public C0605(int i) {
        this(AbstractC1697.f5662.addAndGet(1), (i & 1) == 0);
    }
}
