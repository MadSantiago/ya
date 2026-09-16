package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۥؚِۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0811 extends AbstractC2975 implements Parcelable, InterfaceC5910, InterfaceC5372, InterfaceC4367 {
    public static final Parcelable.Creator<C0811> CREATOR = new C1432(14);

    /* JADX INFO: renamed from: ۦ۟ */
    public C3069 f2883;

    public C0811(float f) {
        AbstractC3191 abstractC3191M3278 = AbstractC1538.m3278();
        C3069 c3069 = new C3069(f, abstractC3191M3278.mo5118());
        if (!(abstractC3191M3278 instanceof C2388)) {
            c3069.f16355 = new C3069(f, 1L);
        }
        this.f2883 = c3069;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC5372
    public final Object getValue() {
        return Float.valueOf(m1711());
    }

    @Override // p000.InterfaceC4367
    public final void setValue(Object obj) {
        m1710(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C3069) AbstractC1538.m3272(this.f2883)).f10315 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m1711());
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo353() {
        return Float.valueOf(m1711());
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥُ */
    public final void mo354(AbstractC4937 abstractC4937) {
        this.f2883 = (C3069) abstractC4937;
    }

    @Override // p000.InterfaceC5910
    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC0241 mo355() {
        return C1298.f4439;
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC4937 mo356() {
        return this.f2883;
    }

    @Override // p000.InterfaceC4367
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4745 mo357() {
        return new C4884(10, this);
    }

    @Override // p000.InterfaceC0622
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4937 mo358(AbstractC4937 abstractC4937, AbstractC4937 abstractC4938, AbstractC4937 abstractC4939) {
        if (((C3069) abstractC4938).f10315 == ((C3069) abstractC4939).f10315) {
            return abstractC4938;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m1710(float f) {
        AbstractC3191 abstractC3191M3278;
        C3069 c3069 = (C3069) AbstractC1538.m3272(this.f2883);
        if (c3069.f10315 == f) {
            return;
        }
        C3069 c30610 = this.f2883;
        synchronized (AbstractC1538.f5203) {
            abstractC3191M3278 = AbstractC1538.m3278();
            ((C3069) AbstractC1538.m3288(c30610, this, abstractC3191M3278, c3069)).f10315 = f;
        }
        AbstractC1538.m3281(abstractC3191M3278, this);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final float m1711() {
        return ((C3069) AbstractC1538.m3270(this.f2883, this)).f10315;
    }
}
