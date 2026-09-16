package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: renamed from: ۥٍؚؒ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0769 implements ServiceConnection, InterfaceC0500, InterfaceC2023 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5695 f2785;

    /* JADX INFO: renamed from: ۦ۟ */
    public volatile C2421 f2786;

    /* JADX INFO: renamed from: ۦۨ */
    public volatile boolean f2787;

    public ServiceConnectionC0769(C5695 c5695) {
        this.f2785 = c5695;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3644 c3644 = ((C5371) this.f2785.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6524();
        synchronized (this) {
            int i = 0;
            if (iBinder == null) {
                this.f2787 = false;
                C3610 c3610 = ((C5371) this.f2785.f18660).f17717;
                C5371.m9020(c3610);
                c3610.f12020.m9432("Service connected with null binder");
                return;
            }
            InterfaceC5253 c3873 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c3873 = iInterfaceQueryLocalInterface instanceof InterfaceC5253 ? (InterfaceC5253) iInterfaceQueryLocalInterface : new C3873(iBinder);
                    C3610 c3611 = ((C5371) this.f2785.f18660).f17717;
                    C5371.m9020(c3611);
                    c3611.f12023.m9432("Bound to IMeasurementService interface");
                } else {
                    C3610 c3612 = ((C5371) this.f2785.f18660).f17717;
                    C5371.m9020(c3612);
                    c3612.f12020.m9430(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                C3610 c3613 = ((C5371) this.f2785.f18660).f17717;
                C5371.m9020(c3613);
                c3613.f12020.m9432("Service connect failed to get IMeasurementService");
            }
            if (c3873 == null) {
                this.f2787 = false;
                try {
                    C4601 c4601M8000 = C4601.m8000();
                    C5695 c5695 = this.f2785;
                    c4601M8000.m8002(((C5371) c5695.f18660).f17739, c5695.f18732);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C3644 c3645 = ((C5371) this.f2785.f18660).f17733;
                C5371.m9020(c3645);
                c3645.m6515(new RunnableC5228(this, c3873, i));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5371 c5371 = (C5371) this.f2785.f18660;
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.m6524();
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12015.m9432("Service disconnected");
        C3644 c3645 = c5371.f17733;
        C5371.m9020(c3645);
        c3645.m6515(new RunnableC5413(4, this, componentName, false));
    }

    @Override // p000.InterfaceC0500
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo1143() {
        C3644 c3644 = ((C5371) this.f2785.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6524();
        synchronized (this) {
            try {
                AbstractC0487.m1047(this.f2786);
                InterfaceC5253 interfaceC5253 = (InterfaceC5253) this.f2786.m7333();
                C3644 c3645 = ((C5371) this.f2785.f18660).f17733;
                C5371.m9020(c3645);
                c3645.m6515(new RunnableC5228(this, interfaceC5253, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f2786 = null;
                this.f2787 = false;
            }
        }
    }

    @Override // p000.InterfaceC2023
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1660(C2612 c2612) {
        boolean z;
        C5695 c5695 = this.f2785;
        C3644 c3644 = ((C5371) c5695.f18660).f17733;
        C5371.m9020(c3644);
        c3644.m6524();
        C3610 c3610 = ((C5371) c5695.f18660).f17717;
        if (c3610 == null || !c3610.f911) {
            c3610 = null;
        }
        if (c3610 != null) {
            c3610.f12023.m9430(c2612, "Service connection failed");
        }
        synchronized (this) {
            z = false;
            this.f2787 = false;
            this.f2786 = null;
        }
        C3644 c3645 = ((C5371) this.f2785.f18660).f17733;
        C5371.m9020(c3645);
        c3645.m6515(new RunnableC5413(5, this, c2612, z));
    }

    @Override // p000.InterfaceC0500
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1144(int i) {
        C5371 c5371 = (C5371) this.f2785.f18660;
        C3644 c3644 = c5371.f17733;
        C5371.m9020(c3644);
        c3644.m6524();
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12015.m9432("Service connection suspended");
        C3644 c3645 = c5371.f17733;
        C5371.m9020(c3645);
        c3645.m6515(new RunnableC3365(20, this));
    }
}
