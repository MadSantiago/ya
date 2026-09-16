package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥٌٟ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0925 extends AbstractC2975 implements Parcelable, InterfaceC5910, InterfaceC5372, InterfaceC4367 {
    public static final Parcelable.Creator<C0925> CREATOR = new C1432(16);

    /* JADX INFO: renamed from: ۦ۟ */
    public C5200 f3309;

    public C0925(long j) {
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        C5200 c5200 = new C5200(abstractC3191M3278.mo5118(), j);
        if (!(abstractC3191M3278 instanceof C2388)) {
            c5200.f16355 = new C5200(1L, j);
        }
        this.f3309 = c5200;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return Long.valueOf(m1901());
    }

    @Override // p000.InterfaceC4367
    public final void setValue(Object obj) {
        m1900(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((C5200) AbstractC1538.m3272(this.f3309)).f17193 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m1901());
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo353() {
        return Long.valueOf(m1901());
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo354(AbstractC4937 abstractC4937) {
        this.f3309 = (C5200) abstractC4937;
    }

    @Override // p000.InterfaceC5910
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC0241 mo355() {
        return C1298.f4439;
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo356() {
        return this.f3309;
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 mo357() {
        return new C4884(12, this);
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4937 mo358(AbstractC4937 abstractC4937, AbstractC4937 abstractC4938, AbstractC4937 abstractC4939) {
        if (((C5200) abstractC4938).f17193 == ((C5200) abstractC4939).f17193) {
            return abstractC4938;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m1900(long j) {
        AbstractC3191 abstractC3191M3278;
        C5200 c5200 = (C5200) AbstractC1538.m3272(this.f3309);
        if (c5200.f17193 != j) {
            C5200 c5201 = this.f3309;
            synchronized (AbstractC1538.f5203) {
                abstractC3191M3278 = AbstractC1538.m3278();
                ((C5200) AbstractC1538.m3288(c5201, this, abstractC3191M3278, c5200)).f17193 = j;
            }
            AbstractC1538.m3281(abstractC3191M3278, this);
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final long m1901() {
        return ((C5200) AbstractC1538.m3270(this.f3309, this)).f17193;
    }
}
