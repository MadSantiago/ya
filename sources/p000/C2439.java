package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥْٖ۟ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2439 extends AbstractC5381 implements InterfaceC4038, InterfaceC2880, InterfaceC2766 {

    /* JADX INFO: renamed from: ۥً */
    public Object f8114;

    /* JADX INFO: renamed from: ۥٕ */
    public PointerInputEventHandler f8115;

    /* JADX INFO: renamed from: ۥۙ */
    public C2127 f8116;

    /* JADX INFO: renamed from: ۥۦ */
    public final C0863 f8117;

    /* JADX INFO: renamed from: ۦؖ */
    public final C0863 f8118;

    /* JADX INFO: renamed from: ۦؗ */
    public final C0863 f8119;

    /* JADX INFO: renamed from: ۦؙ */
    public C5639 f8120 = AbstractC2995.f10071;

    /* JADX INFO: renamed from: ۦُ */
    public C5639 f8121;

    /* JADX INFO: renamed from: ۦٖ */
    public long f8122;

    /* JADX INFO: renamed from: ۦٚ */
    public Object f8123;

    public C2439(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f8114 = obj;
        this.f8123 = obj2;
        this.f8115 = pointerInputEventHandler;
        C0863 c0863 = new C0863(new C5475[16]);
        this.f8118 = c0863;
        this.f8117 = c0863;
        this.f8119 = new C0863(new C5475[16]);
        this.f8122 = 0L;
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final Object m4552(InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) {
        C2600 c2600 = new C2600(1, AbstractC2776.m5232(interfaceC0443));
        c2600.m4913();
        C5475 c5475 = new C5475(this, c2600);
        synchronized (this.f8117) {
            this.f8118.m1843(c5475);
            new C1792(AbstractC2776.m5232(AbstractC2776.m5246(c5475, c5475, interfaceC5731))).mo335(C2358.f7817);
        }
        c2600.m4908(new C4627(0, c5475));
        return c2600.m4909();
    }

    /* JADX INFO: renamed from: ۥؒ */
    public final void m4553() {
        C2127 c2127 = this.f8116;
        if (c2127 != null) {
            c2127.mo885(new C4511(2, "Pointer input was reset"));
            this.f8116 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0021, B:17:0x0024, B:20:0x0030, B:22:0x0038, B:24:0x003c, B:25:0x0041, B:26:0x0044, B:28:0x004d, B:30:0x0055, B:32:0x0059), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: ۥٜ */
    public final void m4554(C5639 c5639, EnumC3834 enumC3834) {
        Object[] objArr;
        int i;
        int i2;
        C5475 c5475;
        C2600 c2600;
        C2600 c2601;
        synchronized (this.f8117) {
            C0863 c0863 = this.f8119;
            c0863.m1840(c0863.f3180, this.f8118);
        }
        try {
            int iOrdinal = enumC3834.ordinal();
            if (iOrdinal == 0) {
                C0863 c0864 = this.f8119;
                objArr = c0864.f3182;
                i = c0864.f3180;
                for (i2 = 0; i2 < i; i2++) {
                    c5475 = (C5475) objArr[i2];
                    if (enumC3834 != c5475.f18067 && (c2600 = c5475.f18066) != null) {
                        c5475.f18066 = null;
                        c2600.mo335(c5639);
                    }
                }
            } else if (iOrdinal == 1) {
                C0863 c0865 = this.f8119;
                int i3 = c0865.f3180 - 1;
                Object[] objArr2 = c0865.f3182;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        C5475 c5476 = (C5475) objArr2[i3];
                        if (enumC3834 == c5476.f18067 && (c2601 = c5476.f18066) != null) {
                            c5476.f18066 = null;
                            c2601.mo335(c5639);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C1228(6);
                }
                C0863 c0866 = this.f8119;
                objArr = c0866.f3182;
                i = c0866.f3180;
                while (i2 < i) {
                    c5475 = (C5475) objArr[i2];
                    if (enumC3834 != c5475.f18067) {
                    }
                }
            }
            this.f8119.m1851();
        } catch (Throwable th) {
            this.f8119.m1851();
            throw th;
        }
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۥۗ */
    public final float mo746() {
        return AbstractC5537.m9270(this).f2236.mo746();
    }

    @Override // p000.InterfaceC3975
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo933() {
        m4553();
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        C5639 c5639 = this.f8121;
        if (c5639 == null) {
            return;
        }
        List list = c5639.f18583;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C3536) list.get(i)).f11733) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C3536 c3536 = (C3536) list.get(i2);
                    long j = c3536.f11732;
                    long j2 = c3536.f11726;
                    long j3 = c3536.f11730;
                    float f = c3536.f11727;
                    boolean z = c3536.f11733;
                    arrayList.add(new C3536(j, j3, j2, false, f, j3, j2, z, z, c3536.f11737, 0L, 1.0f, 0L));
                }
                C5639 c56310 = new C5639(arrayList, null);
                this.f8120 = c56310;
                m4554(c56310, EnumC3834.f12725);
                m4554(c56310, EnumC3834.f12724);
                m4554(c56310, EnumC3834.f12722);
                this.f8121 = null;
                return;
            }
        }
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        this.f8122 = j;
        if (enumC3834 == EnumC3834.f12725) {
            this.f8120 = c5639;
        }
        InterfaceC0443 interfaceC0443 = null;
        if (this.f8116 == null) {
            this.f8116 = AbstractC2765.m5135(m9076(), null, 4, new C2718(this, interfaceC0443, 15), 1);
        }
        m4554(c5639, enumC3834);
        List list = c5639.f18583;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!AbstractC3801.m6754((C3536) list.get(i))) {
                this.f8121 = c5639;
            }
        }
        c5639 = null;
        this.f8121 = c5639;
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        m4553();
    }

    @Override // p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦٝ */
    public final void mo4555() {
        m4553();
    }

    @Override // p000.InterfaceC2880
    /* JADX INFO: renamed from: ۦۚ */
    public final float mo754() {
        return AbstractC5537.m9270(this).f2236.mo754();
    }
}
