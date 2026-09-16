package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: renamed from: ۥۛؗۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2341 extends AbstractC3831 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7778;

    @Override // p000.AbstractC3831
    /* JADX INFO: renamed from: ۦِ */
    public InterfaceC0858 mo4390(Context context, Looper looper, C2813 c2813, Object obj, InterfaceC1895 interfaceC1895, InterfaceC3785 interfaceC3785) {
        switch (this.f7778) {
            case 0:
                Object obj2 = c2813.f9391;
                Integer num = (Integer) c2813.f9392;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C5719(context, looper, c2813, bundle, interfaceC1895, interfaceC3785);
            case 1:
                throw AbstractC2049.m3995(obj);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                return super.mo4390(context, looper, c2813, obj, interfaceC1895, interfaceC3785);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C5390(context, looper, 51, c2813, interfaceC1895, interfaceC3785);
        }
    }

    @Override // p000.AbstractC3831
    /* JADX INFO: renamed from: ۦۗ */
    public /* synthetic */ InterfaceC0858 mo4391(Context context, Looper looper, C2813 c2813, Object obj, C3184 c3184, C3184 c3185) {
        switch (this.f7778) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C5340(context, looper, c2813, (C3946) obj, c3184, c3185);
            default:
                return super.mo4391(context, looper, c2813, obj, c3184, c3185);
        }
    }
}
