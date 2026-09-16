package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۦۦؑٝٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5734 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final C5734 f18904 = new C5734();

    /* JADX INFO: renamed from: ۥۗ */
    public final ConcurrentHashMap f18905 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ۥۣ */
    public final C4228 f18906 = new C4228(2);

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC1622 m9541(Class cls) {
        C2637 c2637;
        InterfaceC1622 interfaceC1622M4997;
        Class cls2;
        AbstractC3576.m6385(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f18905;
        InterfaceC1622 interfaceC1622 = (InterfaceC1622) concurrentHashMap.get(cls);
        if (interfaceC1622 != null) {
            return interfaceC1622;
        }
        Class cls3 = AbstractC0499.f1810;
        if (!AbstractC0318.class.isAssignableFrom(cls) && (cls2 = AbstractC0499.f1810) != null && !cls2.isAssignableFrom(cls)) {
            C1078.m2272("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        C4022 c4022Mo6546 = ((C3691) this.f18906.f14025).mo6546(cls);
        if ((c4022Mo6546.f13416 & 2) == 2) {
            if (AbstractC0318.class.isAssignableFrom(cls)) {
                interfaceC1622M4997 = new C3119(AbstractC0499.f1808, AbstractC2804.f9359, c4022Mo6546.f13415);
            } else {
                C0841 c0841 = AbstractC0499.f1809;
                C2637 c2638 = AbstractC2804.f9358;
                if (c2638 == null) {
                    C1078.m2276("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC1622M4997 = new C3119(c0841, c2638, c4022Mo6546.f13415);
            }
        } else if (AbstractC0318.class.isAssignableFrom(cls)) {
            interfaceC1622M4997 = C2687.m4997(c4022Mo6546, AbstractC2938.f9871, AbstractC2574.f8591, AbstractC0499.f1808, AbstractC3761.m6632(c4022Mo6546.m7194()) != 1 ? AbstractC2804.f9359 : null, AbstractC4529.f14967);
        } else {
            C4684 c4684 = AbstractC2938.f9872;
            C0750 c0750 = AbstractC2574.f8592;
            C0841 c0842 = AbstractC0499.f1809;
            if (AbstractC3761.m6632(c4022Mo6546.m7194()) != 1) {
                C2637 c2639 = AbstractC2804.f9358;
                if (c2639 == null) {
                    C1078.m2276("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c2637 = c2639;
            } else {
                c2637 = null;
            }
            interfaceC1622M4997 = C2687.m4997(c4022Mo6546, c4684, c0750, c0842, c2637, AbstractC4529.f14968);
        }
        InterfaceC1622 interfaceC1623 = (InterfaceC1622) concurrentHashMap.putIfAbsent(cls, interfaceC1622M4997);
        return interfaceC1623 != null ? interfaceC1623 : interfaceC1622M4997;
    }
}
