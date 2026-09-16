package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: ۦٜۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5072 extends AbstractC2511 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ AbstractC4150 f16824;

    /* JADX INFO: renamed from: ۦۙ */
    public final IBinder f16825;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5072(AbstractC4150 abstractC4150, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC4150, i, bundle);
        this.f16824 = abstractC4150;
        this.f16825 = iBinder;
    }

    @Override // p000.AbstractC2511
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo1920(C2612 c2612) {
        InterfaceC2023 interfaceC2023 = this.f16824.f13828;
        if (interfaceC2023 != null) {
            interfaceC2023.mo1660(c2612);
        }
        System.currentTimeMillis();
    }

    @Override // p000.AbstractC2511
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1921() {
        IBinder iBinder = this.f16825;
        try {
            AbstractC0487.m1047(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC4150 abstractC4150 = this.f16824;
            if (!abstractC4150.mo4541().equals(interfaceDescriptor)) {
                String strMo4541 = abstractC4150.mo4541();
                StringBuilder sb = new StringBuilder(strMo4541.length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(strMo4541);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceMo4542 = abstractC4150.mo4542(iBinder);
            if (iInterfaceMo4542 == null || !(abstractC4150.m7342(2, 4, iInterfaceMo4542) || abstractC4150.m7342(3, 4, iInterfaceMo4542))) {
                return false;
            }
            abstractC4150.f13822 = null;
            InterfaceC0500 interfaceC0500 = abstractC4150.f13811;
            if (interfaceC0500 == null) {
                return true;
            }
            interfaceC0500.mo1143();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
