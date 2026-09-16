package p000;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۥٓؒٔٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1255 extends AbstractBinderC1892 implements InterfaceC0277 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C5695 f4321;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ AtomicReference f4322;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1255(C5695 c5695, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f4322 = atomicReference;
        this.f4321 = c5695;
    }

    @Override // p000.InterfaceC0277
    /* JADX INFO: renamed from: ۥ۟ */
    public final void mo582(C0795 c0795) {
        AtomicReference atomicReference = this.f4322;
        synchronized (atomicReference) {
            C3610 c3610 = ((C5371) this.f4321.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12023.m9430(Integer.valueOf(c0795.f2861.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(c0795);
            atomicReference.notifyAll();
        }
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        C0795 c0795 = (C0795) AbstractC5564.m9346(parcel, C0795.CREATOR);
        AbstractC5564.m9347(parcel);
        mo582(c0795);
        return true;
    }
}
