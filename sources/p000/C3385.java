package p000;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ۦؖٓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3385 implements InterfaceC3665 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final C5371 f11283;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11284 = 2;

    public C3385(C5034 c5034) {
        this.f11283 = c5034.f16665;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // p000.InterfaceC3665
    /* JADX INFO: renamed from: ۥۗ */
    public void mo6147(int i, Throwable th, byte[] bArr) {
        C3610 c3610;
        C3610 c3611;
        int i2 = i;
        C5371 c5371 = this.f11283;
        C3610 c3612 = c5371.f17717;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                C4474 c4474 = c5371.f17713;
                C5371.m9021(c4474);
                c4474.f14765.m8174(true);
                if (bArr != null || bArr.length == 0) {
                    C5371.m9020(c3612);
                    c3612.f12015.m9432("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        C5371.m9020(c3612);
                        c3612.f12015.m9432("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    C1512 c1512 = c5371.f17721;
                    C5371.m9021(c1512);
                    C5371 c5372 = (C5371) c1512.f18660;
                    if (TextUtils.isEmpty(strOptString)) {
                        c3611 = c3612;
                    } else {
                        Context context = c5372.f17739;
                        c3611 = c3612;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                c5371.f17709.m8879("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = c5372.f17739;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    C3610 c3613 = ((C5371) c1512.f18660).f17717;
                                    C5371.m9020(c3613);
                                    c3613.f12020.m9430(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            c3610 = c3611;
                            C5371.m9020(c3610);
                            c3610.f12020.m9430(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    C5371.m9020(c3611);
                    c3610 = c3611;
                    try {
                        c3610.f12022.m9431("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        C5371.m9020(c3610);
                        c3610.f12020.m9430(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    c3610 = c3612;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                C4474 c4475 = c5371.f17713;
                C5371.m9021(c4475);
                c4475.f14765.m8174(true);
                if (bArr != null) {
                }
                C5371.m9020(c3612);
                c3612.f12015.m9432("Deferred Deep Link response empty.");
                return;
            }
        }
        C5371.m9020(c3612);
        c3612.f12022.m9434(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    /* JADX INFO: renamed from: ۥۣ */
    public boolean m6148() {
        int i = this.f11284;
        C5371 c5371 = this.f11283;
        switch (i) {
            case 0:
                try {
                    return C3866.m6899(c5371.f17739).m564(128, "com.android.vending").versionCode >= 80837300;
                } catch (Exception e) {
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12023.m9430(e, "Failed to retrieve Play Store version for Install Referrer");
                    return false;
                }
            default:
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                return Log.isLoggable(c3611.m6441(), 3);
        }
    }

    public /* synthetic */ C3385(C5371 c5371) {
        this.f11283 = c5371;
    }

    public C3385(C0540 c0540, C5371 c5371) {
        this.f11283 = c5371;
    }
}
