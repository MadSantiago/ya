package p000;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: ۥۤؔۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2675 extends AbstractDialogInterfaceOnClickListenerC0521 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ GoogleApiActivity f8859;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ Intent f8860;

    public C2675(Intent intent, GoogleApiActivity googleApiActivity) {
        this.f8860 = intent;
        this.f8859 = googleApiActivity;
    }

    @Override // p000.AbstractDialogInterfaceOnClickListenerC0521
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1171() {
        Intent intent = this.f8860;
        if (intent != null) {
            this.f8859.startActivityForResult(intent, 2);
        }
    }
}
