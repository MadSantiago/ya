package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؘؙٕٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4269 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f14131;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f14132;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f14133 = 1;

    public C4269(C3368 c3368) {
        this.f14131 = c3368;
        this.f14132 = new Messenger(new Handler(Looper.getMainLooper(), c3368));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IBinder binder;
        InterfaceC2585 interfaceC2585;
        switch (this.f14133) {
            case 0:
                C3368 c3368 = (C3368) this.f14131;
                ArrayList arrayList = c3368.f11253;
                Bundle bundleExtra = intent.getBundleExtra("extra.bundle");
                if (bundleExtra == null || (binder = bundleExtra.getBinder("binder")) == null) {
                    return;
                }
                BinderC4778 binderC4778 = BinderC4778.f15758;
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2585)) {
                    C0716 c0716 = new C0716();
                    c0716.f2621 = binder;
                    interfaceC2585 = c0716;
                } else {
                    interfaceC2585 = (InterfaceC2585) iInterfaceQueryLocalInterface;
                }
                try {
                    interfaceC2585.mo1583(((Messenger) this.f14132).getBinder());
                    C3209 c3209 = new C3209(c3368, interfaceC2585);
                    if (intent.getBooleanExtra("extra.daemon", false)) {
                        c3368.f11251 = c3209;
                        c3368.f11248 &= -3;
                    } else {
                        c3368.f11252 = c3209;
                        c3368.f11248 &= -2;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C3412 c3412 = (C3412) arrayList.get(size);
                        if (c3412.f11363.m6125(c3412.f11362, c3412.f11361, c3412.f11364) == null) {
                            arrayList.remove(size);
                        }
                    }
                    return;
                } catch (RemoteException e) {
                    AbstractC2774.m5205("IPC", e);
                    return;
                }
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    throw null;
                }
                return;
        }
    }

    public C4269(C2346 c2346) {
        this.f14131 = c2346;
    }
}
