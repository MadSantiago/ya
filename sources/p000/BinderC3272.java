package p000;

import android.os.Parcel;

/* JADX INFO: renamed from: ۦٕؕؓۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3272 extends AbstractBinderC1892 implements InterfaceC3941 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ RunnableC5413 f10986;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3272(C1976 c1976, RunnableC5413 runnableC5413) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f10986 = runnableC5413;
    }

    @Override // p000.AbstractBinderC1892
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo479(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo5838();
        return true;
    }

    @Override // p000.InterfaceC3941
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo5838() {
        this.f10986.run();
    }
}
