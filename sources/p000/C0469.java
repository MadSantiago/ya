package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥُؕؕۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0469 extends AbstractC2109 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f1693;

    /* JADX INFO: renamed from: ۥَ */
    public final C4994 f1694;

    /* JADX INFO: renamed from: ۥُ */
    public Throwable f1695;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f1696;

    /* JADX INFO: renamed from: ۥْ */
    public C3639 f1697;

    /* JADX INFO: renamed from: ۥٓ */
    public C2600 f1698;

    /* JADX INFO: renamed from: ۥٖ */
    public boolean f1699;

    /* JADX INFO: renamed from: ۥٙ */
    public final C4992 f1700;

    /* JADX INFO: renamed from: ۥۖ */
    public final C3841 f1701;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f1702;

    /* JADX INFO: renamed from: ۥۜ */
    public C3639 f1703;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2404 f1704;

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC3196 f1705;

    /* JADX INFO: renamed from: ۦؚ */
    public final C3262 f1706;

    /* JADX INFO: renamed from: ۦٌ */
    public final C3369 f1707;

    /* JADX INFO: renamed from: ۦِ */
    public final ArrayList f1708;

    /* JADX INFO: renamed from: ۦٕ */
    public final InterfaceC3534 f1709;

    /* JADX INFO: renamed from: ۦٗ */
    public final C4994 f1710;

    /* JADX INFO: renamed from: ۦٛ */
    public final C0863 f1711;

    /* JADX INFO: renamed from: ۦۗ */
    public final ArrayList f1712;

    /* JADX INFO: renamed from: ۦۙ */
    public List f1713;

    /* JADX INFO: renamed from: ۦۚ */
    public final C3262 f1714;

    /* JADX INFO: renamed from: ۦۛ */
    public final C5460 f1715;

    /* JADX INFO: renamed from: ۦ۟ */
    public ArrayList f1716;

    /* JADX INFO: renamed from: ۦۨ */
    public final C3262 f1717;

    /* JADX INFO: renamed from: ۥؖ */
    public static final C4994 f1692 = AbstractC1605.m3349(C5909.f19493);

    /* JADX INFO: renamed from: ۥؓ */
    public static final AtomicReference f1691 = new AtomicReference(Boolean.FALSE);

    public C0469(InterfaceC3534 interfaceC3534) {
        C2404 c2404 = new C2404(new C2527(this, 0));
        this.f1704 = c2404;
        this.f1702 = new C2808(new C2527(this, 1));
        this.f1693 = new Object();
        this.f1696 = new ArrayList();
        this.f1703 = new C3639();
        this.f1711 = new C0863(new C1946[16]);
        this.f1708 = new ArrayList();
        this.f1712 = new ArrayList();
        this.f1706 = new C3262();
        this.f1707 = new C3369(17);
        this.f1714 = new C3262();
        this.f1717 = new C3262();
        this.f1694 = AbstractC1605.m3349(null);
        this.f1710 = AbstractC1605.m3349(EnumC3359.f11225);
        this.f1715 = new C5460(2);
        C3841 c3841 = new C3841((InterfaceC3196) interfaceC3534.mo865(C1397.f4791));
        c3841.mo859(new C0091(28, this));
        this.f1701 = c3841;
        this.f1709 = interfaceC3534.mo860(c2404).mo860(c3841);
        this.f1700 = new C4992(23);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static void m985(C5038 c5038) {
        try {
            if (c5038.mo2658() instanceof C4894) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            c5038.mo2657();
        } catch (Throwable th) {
            c5038.mo2657();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final void m986(ArrayList arrayList, C0469 c0469, C1946 c1946) {
        arrayList.clear();
        synchronized (c0469.f1693) {
            Iterator it = c0469.f1712.iterator();
            if (it.hasNext()) {
                ((AbstractC0210) it.next()).getClass();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean m987() {
        return this.f1711.f3180 != 0 || m988() || m1002() || this.f1706.m6024();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m988() {
        return !this.f1699 && (((C5592) ((C1414) this.f1704.f8010).f4869).get() & 134217727) > 0;
    }

    /* JADX INFO: renamed from: ۥً */
    public final boolean m989() {
        boolean z;
        synchronized (this.f1693) {
            z = this.f1703.m6494() || this.f1711.f3180 != 0 || m988() || m1002();
        }
        return z;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥَ */
    public final InterfaceC1663 mo990(C5285 c5285) {
        C2808 c2808 = this.f1702;
        C1414 c1414 = (C1414) c2808.f9376;
        C3766 c3766 = new C3766();
        c3766.f12525 = c5285;
        return c1414.m2991(c3766, (C1225) c2808.f9377);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥُ */
    public final boolean mo991() {
        return false;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo992() {
        return false;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥْ */
    public final void mo993(C5863 c5863) {
        C5460 c5460 = this.f1715;
        C3639 c3639 = (C3639) c5460.get();
        if (c3639 == null) {
            C3639 c36310 = AbstractC5705.f18789;
            c3639 = new C3639();
            c5460.m9128(c3639);
        }
        c3639.m6495(c5863);
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥٓ */
    public final void mo994(C1946 c1946) {
        synchronized (this.f1693) {
            try {
                C3639 c3639 = this.f1697;
                if (c3639 == null) {
                    C3639 c36310 = AbstractC5705.f18789;
                    c3639 = new C3639();
                    this.f1697 = c3639;
                }
                c3639.m6495(c1946);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m995() {
        InterfaceC4242 interfaceC4242M996;
        synchronized (this.f1693) {
            interfaceC4242M996 = m996();
            if (((EnumC3359) this.f1710.getValue()).compareTo(EnumC3359.f11229) <= 0) {
                Throwable th = this.f1695;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (interfaceC4242M996 != null) {
            ((C2600) interfaceC4242M996).mo335(C2358.f7817);
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final InterfaceC4242 m996() throws C0768 {
        C4994 c4994 = this.f1710;
        int iCompareTo = ((EnumC3359) c4994.getValue()).compareTo(EnumC3359.f11229);
        C4994 c4995 = this.f1694;
        ArrayList arrayList = this.f1712;
        ArrayList arrayList2 = this.f1708;
        C0863 c0863 = this.f1711;
        if (iCompareTo > 0) {
            Object value = c4995.getValue();
            EnumC3359 enumC3359 = EnumC3359.f11227;
            EnumC3359 enumC33510 = EnumC3359.f11225;
            if (value == null) {
                if (this.f1705 == null) {
                    this.f1703 = new C3639();
                    c0863.m1851();
                    if (m988() || m1002()) {
                        enumC33510 = EnumC3359.f11226;
                    }
                } else {
                    enumC33510 = (c0863.f3180 != 0 || this.f1703.m6494() || !arrayList2.isEmpty() || !arrayList.isEmpty() || m988() || m1002() || this.f1706.m6024()) ? enumC3359 : EnumC3359.f11224;
                }
            }
            c4994.m8388(null, enumC33510);
            if (enumC33510 != enumC3359) {
                return null;
            }
            C2600 c2600 = this.f1698;
            this.f1698 = null;
            return c2600;
        }
        List listM1012 = m1012();
        int size = listM1012.size();
        for (int i = 0; i < size; i++) {
        }
        this.f1696.clear();
        this.f1713 = C2340.f7777;
        this.f1703 = new C3639();
        c0863.m1851();
        arrayList2.clear();
        arrayList.clear();
        this.f1716 = null;
        C2600 c2601 = this.f1698;
        if (c2601 != null) {
            c2601.mo3713(null);
        }
        this.f1698 = null;
        c4995.m8387(null);
        return null;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥۗ */
    public final C3639 mo997(C1946 c1946, InterfaceC0557 interfaceC0557, InterfaceC5731 interfaceC5731) {
        C5460 c5460 = this.f1715;
        try {
            InterfaceC0557 interfaceC0558 = c1946.f6434;
            c1946.f6434 = interfaceC0557;
            try {
                mo1000(c1946, interfaceC5731);
                C3639 c3639 = (C3639) c5460.get();
                if (c3639 == null) {
                    c3639 = AbstractC5705.f18789;
                }
                c1946.f6434 = interfaceC0558;
                c5460.m9128(null);
                return c3639;
            } catch (Throwable th) {
                c1946.f6434 = interfaceC0558;
                throw th;
            }
        } catch (Throwable th2) {
            c5460.m9128(null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final void m998(C1946 c1946) {
        synchronized (this.f1693) {
            ArrayList arrayList = this.f1712;
            if (arrayList.size() > 0) {
                ((AbstractC0210) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥۜ */
    public final InterfaceC5601 mo999() {
        return null;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1000(C1946 c1946, InterfaceC5731 interfaceC5731) throws Throwable {
        EnumC3359 enumC3359;
        int i;
        boolean z;
        C5038 c5038Mo4466;
        boolean z2 = c1946.f6429.f17660;
        synchronized (this.f1693) {
            EnumC3359 enumC33510 = (EnumC3359) this.f1710.getValue();
            enumC3359 = EnumC3359.f11229;
            i = 1;
            z = enumC33510.compareTo(enumC3359) > 0 ? !m1012().contains(c1946) : true;
        }
        try {
            C0091 c0091 = new C0091(27, c1946);
            C1708 c1708 = new C1708(i, c1946, null);
            AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
            C5038 c5038 = abstractC3191M3278 instanceof C5038 ? (C5038) abstractC3191M3278 : null;
            if (c5038 == null || (c5038Mo4466 = c5038.mo4466(c0091, c1708)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC3191 abstractC3191M5883 = c5038Mo4466.m5883();
                try {
                    c1946.m3826(interfaceC5731);
                    AbstractC3191.m5876(abstractC3191M5883);
                    m985(c5038Mo4466);
                    synchronized (this.f1693) {
                        if (((EnumC3359) this.f1710.getValue()).compareTo(enumC3359) > 0 && !m1012().contains(c1946)) {
                            this.f1696.add(c1946);
                            this.f1713 = null;
                        }
                    }
                    if (!z2) {
                        AbstractC1538.m3278().mo4468();
                    }
                    try {
                        m998(c1946);
                        try {
                            c1946.m3823();
                            c1946.m3814();
                            if (z2) {
                                return;
                            }
                            AbstractC1538.m3278().mo4468();
                        } catch (Throwable th) {
                            m1005(th, null);
                        }
                    } catch (Throwable th2) {
                        m1005(th2, c1946);
                    }
                } catch (Throwable th3) {
                    AbstractC3191.m5876(abstractC3191M5883);
                    throw th3;
                }
            } catch (Throwable th4) {
                m985(c5038Mo4466);
                throw th4;
            }
        } catch (Throwable th5) {
            if (z) {
                synchronized (this.f1693) {
                }
            }
            m1005(th5, c1946);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final C1946 m1001(C1946 c1946, C3639 c3639) {
        C5038 c5038Mo4466;
        if (c1946.f6429.f17660 || c1946.f6431 == 3) {
            return null;
        }
        C3639 c36310 = this.f1697;
        int i = 1;
        if (c36310 == null || !c36310.m6490(c1946)) {
            C0091 c0091 = new C0091(27, c1946);
            C1708 c1708 = new C1708(i, c1946, c3639);
            AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
            C5038 c5038 = abstractC3191M3278 instanceof C5038 ? (C5038) abstractC3191M3278 : null;
            if (c5038 == null || (c5038Mo4466 = c5038.mo4466(c0091, c1708)) == null) {
                C1078.m2276("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    AbstractC3191 abstractC3191M5883 = c5038Mo4466.m5883();
                    if (c3639 != null) {
                        try {
                            if (c3639.m6494()) {
                                C1225 c1225 = new C1225(19, c3639, c1946);
                                C5362 c5362 = c1946.f6429;
                                if (c5362.f17660) {
                                    AbstractC5508.m9201("Preparing a composition while composing is not supported");
                                }
                                c5362.f17660 = true;
                                try {
                                    c1225.mo449();
                                    c5362.f17660 = false;
                                } catch (Throwable th) {
                                    c5362.f17660 = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            AbstractC3191.m5876(abstractC3191M5883);
                            throw th2;
                        }
                    }
                    boolean zM3819 = c1946.m3819();
                    AbstractC3191.m5876(abstractC3191M5883);
                    m985(c5038Mo4466);
                    if (zM3819) {
                        return c1946;
                    }
                } catch (Throwable th3) {
                    m985(c5038Mo4466);
                    throw th3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean m1002() {
        return !this.f1699 && (((C5592) ((C1414) this.f1702.f9376).f4869).get() & 134217727) > 0;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo1003() {
        return ((Boolean) f1691.get()).booleanValue();
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final List m1004(List list, C3639 c3639) {
        C5038 c5038Mo4466;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((AbstractC0210) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C1946 c1946 = (C1946) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c1946.f6429.f17660) {
                AbstractC5508.m9201("Check failed");
            }
            C0091 c0091 = new C0091(27, c1946);
            C1708 c1708 = new C1708(1, c1946, c3639);
            AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
            C5038 c5038 = abstractC3191M3278 instanceof C5038 ? (C5038) abstractC3191M3278 : null;
            if (c5038 == null || (c5038Mo4466 = c5038.mo4466(c0091, c1708)) == null) {
                C1078.m2276("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                AbstractC3191 abstractC3191M5883 = c5038Mo4466.m5883();
                try {
                    synchronized (this.f1693) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                AbstractC0210 abstractC0210 = (AbstractC0210) list2.get(i2);
                                C3262 c3262 = this.f1706;
                                abstractC0210.getClass();
                                Object objM8836 = C5217.m8836(c3262);
                                arrayList.add(new C3869(abstractC0210, objM8836));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                C3869 c3869 = (C3869) arrayList.get(i3);
                                if (c3869.f12914 == null) {
                                    C3369 c3369 = this.f1707;
                                    ((AbstractC0210) c3869.f12915).getClass();
                                    if (((C3262) c3369.f11255).m6018(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            C3869 c38610 = (C3869) arrayList.get(i4);
                                            if (c38610.f12914 == null) {
                                                C3369 c33610 = this.f1707;
                                                ((AbstractC0210) c38610.f12915).getClass();
                                                C3262 c3263 = (C3262) c33610.f11255;
                                                if (c3263.m6025()) {
                                                    ((C3262) c33610.f11254).m6020();
                                                }
                                            }
                                            arrayList3.add(c38610);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((C3869) arrayList.get(i5)).f12914 != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((C3869) arrayList.get(i6)).f12914 == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        C3869 c38611 = (C3869) arrayList.get(i7);
                                        if (c38611.f12914 == null) {
                                        }
                                    }
                                    synchronized (this.f1693) {
                                        AbstractC3649.m6529(arrayList4, this.f1712);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((C3869) obj2).f12914 != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c1946.m3816(arrayList);
                    AbstractC3191.m5876(abstractC3191M5883);
                    m985(c5038Mo4466);
                } catch (Throwable th2) {
                    AbstractC3191.m5876(abstractC3191M5883);
                    throw th2;
                }
            } catch (Throwable th3) {
                m985(c5038Mo4466);
                throw th3;
            }
        }
        return AbstractC0973.m2039(map.keySet());
    }

    /* JADX INFO: renamed from: ۦؗ */
    public final void m1005(Throwable th, C1946 c1946) throws Throwable {
        if (!((Boolean) f1691.get()).booleanValue() || (th instanceof C4659)) {
            synchronized (this.f1693) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                C2021 c2021 = (C2021) this.f1694.getValue();
                if (c2021 != null) {
                    throw c2021.f6661;
                }
                C4994 c4994 = this.f1694;
                C2021 c2022 = new C2021(th);
                c4994.getClass();
                c4994.m8388(null, c2022);
            }
            throw th;
        }
        synchronized (this.f1693) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f1708.clear();
                this.f1711.m1851();
                this.f1703 = new C3639();
                this.f1712.clear();
                this.f1706.m6020();
                this.f1714.m6020();
                C4994 c4995 = this.f1694;
                C2021 c2023 = new C2021(th);
                c4995.getClass();
                c4995.m8388(null, c2023);
                if (c1946 != null) {
                    m1011(c1946);
                }
                if (m996() != null) {
                    AbstractC5508.m9201("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦؚ */
    public final void mo1006(C1946 c1946) {
        InterfaceC4242 interfaceC4242M996;
        synchronized (this.f1693) {
            if (this.f1711.m1844(c1946)) {
                interfaceC4242M996 = null;
            } else {
                this.f1711.m1843(c1946);
                interfaceC4242M996 = m996();
            }
        }
        if (interfaceC4242M996 != null) {
            ((C2600) interfaceC4242M996).mo335(C2358.f7817);
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦٌ */
    public final AbstractC1075 mo1007(AbstractC0210 abstractC0210) {
        AbstractC1075 abstractC1075;
        synchronized (this.f1693) {
            abstractC1075 = (AbstractC1075) this.f1714.m6026(abstractC0210);
        }
        return abstractC1075;
    }

    /* JADX INFO: renamed from: ۦُ */
    public final boolean m1008() {
        boolean zM987;
        synchronized (this.f1693) {
            if (this.f1703.m6502()) {
                return m987();
            }
            List listM1012 = m1012();
            C0675 c0675 = new C0675(this.f1703);
            this.f1703 = new C3639();
            try {
                int size = listM1012.size();
                for (int i = 0; i < size; i++) {
                    ((C1946) listM1012.get(i)).m3827(c0675);
                    if (((EnumC3359) this.f1710.getValue()).compareTo(EnumC3359.f11229) <= 0) {
                        break;
                    }
                }
                synchronized (this.f1693) {
                    if (m996() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM987 = m987();
                }
                return zM987;
            } catch (Throwable th) {
                synchronized (this.f1693) {
                    C3639 c3639 = this.f1703;
                    int i2 = c3639.f12176;
                    Iterator<E> it = c0675.iterator();
                    while (it.hasNext()) {
                        c3639.m6501(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦِ */
    public final InterfaceC3534 mo1009() {
        return this.f1709;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m1010() {
        synchronized (this.f1693) {
            if (((EnumC3359) this.f1710.getValue()).compareTo(EnumC3359.f11224) >= 0) {
                C4994 c4994 = this.f1710;
                EnumC3359 enumC3359 = EnumC3359.f11229;
                c4994.getClass();
                c4994.m8388(null, enumC3359);
            }
        }
        this.f1701.mo871(null);
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final void m1011(C1946 c1946) {
        ArrayList arrayList = this.f1716;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f1716 = arrayList;
        }
        if (!arrayList.contains(c1946)) {
            arrayList.add(c1946);
        }
        if (this.f1696.remove(c1946)) {
            this.f1713 = null;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final List m1012() {
        List list = this.f1713;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f1696;
        List arrayList2 = arrayList.isEmpty() ? C2340.f7777 : new ArrayList(arrayList);
        this.f1713 = arrayList2;
        return arrayList2;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo1013() {
        return false;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo1014() {
        return 1000L;
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۚ */
    public final C3639 mo1015(C1946 c1946, InterfaceC0557 interfaceC0557, C3639 c3639) {
        C5460 c5460 = this.f1715;
        try {
            m1008();
            c1946.m3827(new C0675(c3639));
            InterfaceC0557 interfaceC0558 = c1946.f6434;
            c1946.f6434 = interfaceC0557;
            try {
                C1946 c1946M1001 = m1001(c1946, null);
                if (c1946M1001 != null) {
                    m998(c1946);
                    c1946M1001.m3823();
                    c1946M1001.m3814();
                }
                C3639 c36310 = (C3639) c5460.get();
                if (c36310 == null) {
                    c36310 = AbstractC5705.f18789;
                }
                c1946.f6434 = interfaceC0558;
                c5460.m9128(null);
                return c36310;
            } catch (Throwable th) {
                c1946.f6434 = interfaceC0558;
                throw th;
            }
        } catch (Throwable th2) {
            c5460.m9128(null);
            throw th2;
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۛ */
    public final void mo1016(C1946 c1946) {
        synchronized (this.f1693) {
            if (this.f1696.remove(c1946)) {
                this.f1713 = null;
            }
            this.f1711.m1848(c1946);
            this.f1708.remove(c1946);
        }
    }

    @Override // p000.AbstractC2109
    /* JADX INFO: renamed from: ۦۨ */
    public final void mo1017(Set set) {
    }
}
