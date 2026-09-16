package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: ۥًْؓۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0826 extends AbstractC1003 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f2922;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ C5235 f2923;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826(C5235 c5235, InterfaceC1150 interfaceC1150, int i) {
        super(interfaceC1150);
        this.f2922 = i;
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Objects.requireNonNull(c5235);
                this.f2923 = c5235;
                super(interfaceC1150);
                break;
            default:
                Objects.requireNonNull(c5235);
                this.f2923 = c5235;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0288 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0299 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a1 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c5  */
    @Override // p000.AbstractC1003
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo1720() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        C5695 c5695M9028;
        C5371 c5371;
        InterfaceC5253 interfaceC5253;
        C1103 c1103Mo6904;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        C5371 c5372;
        URL url;
        String strConcat;
        int i2 = this.f2922;
        int i3 = 0;
        C5235 c5235 = this.f2923;
        switch (i2) {
            case 0:
                C5235 c5236 = ((C5371) c5235.f18660).f17709;
                C5371.m9023(c5236);
                new Thread(new RunnableC3148(c5236, i3)).start();
                break;
            case 1:
                c5235.m8868();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c5235.m8871();
                break;
            default:
                C5371 c5373 = (C5371) c5235.f18660;
                C4474 c4474 = c5373.f17713;
                C3610 c3610 = c5373.f17717;
                C3644 c3644 = c5373.f17733;
                C5371.m9020(c3644);
                c3644.mo6517();
                C2382 c2382 = c5373.f17712;
                C5371.m9020(c2382);
                C5371 c5374 = (C5371) c2382.f18660;
                C5371.m9020(c2382);
                String strM3854 = c5373.m9029().m3854();
                Boolean boolM1166 = c5373.f17715.m1166("google_analytics_adid_collection_enabled");
                if (boolM1166 == null || boolM1166.booleanValue()) {
                    C5371.m9021(c4474);
                    C5371 c5375 = (C5371) c4474.f18660;
                    c4474.mo6517();
                    if (c4474.m7754().m8815(EnumC4635.f15302)) {
                        c5375.f17719.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = c4474.f14773;
                        if (str3 == null || jElapsedRealtime >= c4474.f14769) {
                            c4474.f14769 = c5375.f17715.m1159(strM3854, AbstractC4936.f16289) + jElapsedRealtime;
                            try {
                                C0946 c0946M8546 = C5037.m8546(c5375.f17739);
                                c4474.f14773 = "";
                                String str4 = c0946M8546.f3351;
                                if (str4 != null) {
                                    c4474.f14773 = str4;
                                }
                                c4474.f14761 = c0946M8546.f3352;
                            } catch (Exception e) {
                                C3610 c3611 = c5375.f17717;
                                C5371.m9020(c3611);
                                c3611.f12015.m9430(e, "Unable to get advertising id");
                                c4474.f14773 = "";
                            }
                            pair = new Pair(c4474.f14773, Boolean.valueOf(c4474.f14761));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(c4474.f14761));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        C5371.m9020(c2382);
                        c2382.m503();
                        ConnectivityManager connectivityManager = (ConnectivityManager) c5374.f17739.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            C5695 c5695M9029 = c5373.m9028();
                            c5695M9029.mo6517();
                            c5695M9029.m7643();
                            if (!c5695M9029.m9518()) {
                                C5235 c5237 = c5373.f17709;
                                C5371.m9023(c5237);
                                C5371 c5376 = (C5371) c5237.f18660;
                                c5237.mo6517();
                                c5695M9028 = c5376.m9028();
                                c5371 = (C5371) c5695M9028.f18660;
                                c5695M9028.mo6517();
                                c5695M9028.m7643();
                                interfaceC5253 = c5695M9028.f18733;
                                if (interfaceC5253 == null) {
                                    c5695M9028.m9511();
                                    C3610 c3612 = c5371.f17717;
                                    C5371.m9020(c3612);
                                    c3612.f12015.m9432("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        c1103Mo6904 = interfaceC5253.mo6904(c5695M9028.m9517(false));
                                        c5695M9028.m9520();
                                    } catch (RemoteException e2) {
                                        C3610 c3613 = c5371.f17717;
                                        C5371.m9020(c3613);
                                        c3613.f12020.m9430(e2, "Failed to get consents; remote exception");
                                        c1103Mo6904 = null;
                                    }
                                    if (c1103Mo6904 != null) {
                                        bundle = c1103Mo6904.f3878;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = c5373.f17718;
                                        c5373.f17718 = i + 1;
                                        i3 = i < 10 ? 1 : 0;
                                        C5371.m9020(c3610);
                                        C5590 c5590 = c3610.f12015;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        c5590.m9430(Integer.valueOf(c5373.f17718), AbstractC3761.m6621(sb2, str2, " retryCount"));
                                    } else {
                                        C5211 c5211M8808 = C5211.m8808(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(c5211M8808.m8813());
                                        C5800 c5800M9609 = C5800.m9609(100, bundle);
                                        str = c5800M9609.f19116;
                                        sb.append("&dma=");
                                        Boolean bool2 = c5800M9609.f19112;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = C5211.m8811(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        C5371.m9020(c3610);
                                        c3610.f12023.m9430(sb, "Consent query parameters to Bow");
                                        C1512 c1512 = c5373.f17721;
                                        C5371.m9021(c1512);
                                        ((C5371) c5373.m9029().f18660).f17715.m1160();
                                        String str5 = (String) pair.first;
                                        long jM7371 = c4474.f14763.m7371() - 1;
                                        string = sb.toString();
                                        c5372 = (C5371) c1512.f18660;
                                        try {
                                            AbstractC0487.m1090(str5);
                                            AbstractC0487.m1090(strM3854);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c1512.m3242()) + "&rdid=" + str5 + "&bundleid=" + strM3854 + "&retry=" + jM7371;
                                            if (strM3854.equals(c5372.f17715.m1165("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            C3610 c3614 = c5372.f17717;
                                            C5371.m9020(c3614);
                                            c3614.f12020.m9430(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            C3610 c3615 = c5372.f17717;
                                            C5371.m9020(c3615);
                                            c3615.f12020.m9430(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            C5371.m9020(c2382);
                                            C3385 c3385 = new C3385(c5373);
                                            c2382.m503();
                                            C3644 c3645 = c5374.f17733;
                                            C5371.m9020(c3645);
                                            c3645.m6516(new RunnableC1877(c2382, strM3854, url, (byte[]) null, (HashMap) null, c3385));
                                        }
                                    }
                                }
                                c1103Mo6904 = null;
                                if (c1103Mo6904 != null) {
                                    bundle = c1103Mo6904.f3878;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = c5373.f17718;
                                    c5373.f17718 = i + 1;
                                    if (i < 10) {
                                    }
                                    C5371.m9020(c3610);
                                    C5590 c5591 = c3610.f12015;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    c5591.m9430(Integer.valueOf(c5373.f17718), AbstractC3761.m6621(sb3, str2, " retryCount"));
                                } else {
                                    C5211 c5211M8809 = C5211.m8808(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(c5211M8809.m8813());
                                    C5800 c5800M96010 = C5800.m9609(100, bundle);
                                    str = c5800M96010.f19116;
                                    sb.append("&dma=");
                                    Boolean bool3 = c5800M96010.f19112;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = C5211.m8811(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i5);
                                    C5371.m9020(c3610);
                                    c3610.f12023.m9430(sb, "Consent query parameters to Bow");
                                    C1512 c1513 = c5373.f17721;
                                    C5371.m9021(c1513);
                                    ((C5371) c5373.m9029().f18660).f17715.m1160();
                                    String str6 = (String) pair.first;
                                    long jM7372 = c4474.f14763.m7371() - 1;
                                    string = sb.toString();
                                    c5372 = (C5371) c1513.f18660;
                                    AbstractC0487.m1090(str6);
                                    AbstractC0487.m1090(strM3854);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c1513.m3242()) + "&rdid=" + str6 + "&bundleid=" + strM3854 + "&retry=" + jM7372;
                                    if (strM3854.equals(c5372.f17715.m1165("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        C5371.m9020(c2382);
                                        C3385 c3386 = new C3385(c5373);
                                        c2382.m503();
                                        C3644 c3646 = c5374.f17733;
                                        C5371.m9020(c3646);
                                        c3646.m6516(new RunnableC1877(c2382, strM3854, url, (byte[]) null, (HashMap) null, c3386));
                                    }
                                }
                                break;
                            } else {
                                C1512 c1514 = ((C5371) c5695M9029.f18660).f17721;
                                C5371.m9021(c1514);
                                if (c1514.m3242() >= 234200) {
                                    C5235 c5238 = c5373.f17709;
                                    C5371.m9023(c5238);
                                    C5371 c5377 = (C5371) c5238.f18660;
                                    c5238.mo6517();
                                    c5695M9028 = c5377.m9028();
                                    c5371 = (C5371) c5695M9028.f18660;
                                    c5695M9028.mo6517();
                                    c5695M9028.m7643();
                                    interfaceC5253 = c5695M9028.f18733;
                                    if (interfaceC5253 == null) {
                                        c5695M9028.m9511();
                                        C3610 c3616 = c5371.f17717;
                                        C5371.m9020(c3616);
                                        c3616.f12015.m9432("Failed to get consents; not connected to service yet.");
                                    } else {
                                        c1103Mo6904 = interfaceC5253.mo6904(c5695M9028.m9517(false));
                                        c5695M9028.m9520();
                                        if (c1103Mo6904 != null) {
                                            bundle = c1103Mo6904.f3878;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = c5373.f17718;
                                            c5373.f17718 = i + 1;
                                            if (i < 10) {
                                            }
                                            C5371.m9020(c3610);
                                            C5590 c5592 = c3610.f12015;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            c5592.m9430(Integer.valueOf(c5373.f17718), AbstractC3761.m6621(sb4, str2, " retryCount"));
                                        } else {
                                            C5211 c5211M88010 = C5211.m8808(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(c5211M88010.m8813());
                                            C5800 c5800M96011 = C5800.m9609(100, bundle);
                                            str = c5800M96011.f19116;
                                            sb.append("&dma=");
                                            Boolean bool4 = c5800M96011.f19112;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = C5211.m8811(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i6 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i6);
                                            C5371.m9020(c3610);
                                            c3610.f12023.m9430(sb, "Consent query parameters to Bow");
                                            C1512 c1515 = c5373.f17721;
                                            C5371.m9021(c1515);
                                            ((C5371) c5373.m9029().f18660).f17715.m1160();
                                            String str7 = (String) pair.first;
                                            long jM7373 = c4474.f14763.m7371() - 1;
                                            string = sb.toString();
                                            c5372 = (C5371) c1515.f18660;
                                            AbstractC0487.m1090(str7);
                                            AbstractC0487.m1090(strM3854);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c1515.m3242()) + "&rdid=" + str7 + "&bundleid=" + strM3854 + "&retry=" + jM7373;
                                            if (strM3854.equals(c5372.f17715.m1165("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                C5371.m9020(c2382);
                                                C3385 c3387 = new C3385(c5373);
                                                c2382.m503();
                                                C3644 c3647 = c5374.f17733;
                                                C5371.m9020(c3647);
                                                c3647.m6516(new RunnableC1877(c2382, strM3854, url, (byte[]) null, (HashMap) null, c3387));
                                            }
                                        }
                                    }
                                    c1103Mo6904 = null;
                                    if (c1103Mo6904 != null) {
                                        bundle = c1103Mo6904.f3878;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = c5373.f17718;
                                        c5373.f17718 = i + 1;
                                        if (i < 10) {
                                        }
                                        C5371.m9020(c3610);
                                        C5590 c5593 = c3610.f12015;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        c5593.m9430(Integer.valueOf(c5373.f17718), AbstractC3761.m6621(sb5, str2, " retryCount"));
                                    } else {
                                        C5211 c5211M88011 = C5211.m8808(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(c5211M88011.m8813());
                                        C5800 c5800M96012 = C5800.m9609(100, bundle);
                                        str = c5800M96012.f19116;
                                        sb.append("&dma=");
                                        Boolean bool5 = c5800M96012.f19112;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = C5211.m8811(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i7 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i7);
                                        C5371.m9020(c3610);
                                        c3610.f12023.m9430(sb, "Consent query parameters to Bow");
                                        C1512 c1516 = c5373.f17721;
                                        C5371.m9021(c1516);
                                        ((C5371) c5373.m9029().f18660).f17715.m1160();
                                        String str8 = (String) pair.first;
                                        long jM7374 = c4474.f14763.m7371() - 1;
                                        string = sb.toString();
                                        c5372 = (C5371) c1516.f18660;
                                        AbstractC0487.m1090(str8);
                                        AbstractC0487.m1090(strM3854);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c1516.m3242()) + "&rdid=" + str8 + "&bundleid=" + strM3854 + "&retry=" + jM7374;
                                        if (strM3854.equals(c5372.f17715.m1165("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            C5371.m9020(c2382);
                                            C3385 c3388 = new C3385(c5373);
                                            c2382.m503();
                                            C3644 c3648 = c5374.f17733;
                                            C5371.m9020(c3648);
                                            c3648.m6516(new RunnableC1877(c2382, strM3854, url, (byte[]) null, (HashMap) null, c3388));
                                        }
                                    }
                                } else {
                                    C1512 c1517 = c5373.f17721;
                                    C5371.m9021(c1517);
                                    ((C5371) c5373.m9029().f18660).f17715.m1160();
                                    String str9 = (String) pair.first;
                                    long jM7375 = c4474.f14763.m7371() - 1;
                                    string = sb.toString();
                                    c5372 = (C5371) c1517.f18660;
                                    AbstractC0487.m1090(str9);
                                    AbstractC0487.m1090(strM3854);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c1517.m3242()) + "&rdid=" + str9 + "&bundleid=" + strM3854 + "&retry=" + jM7375;
                                    if (strM3854.equals(c5372.f17715.m1165("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        C5371.m9020(c2382);
                                        C3385 c3389 = new C3385(c5373);
                                        c2382.m503();
                                        C3644 c3649 = c5374.f17733;
                                        C5371.m9020(c3649);
                                        c3649.m6516(new RunnableC1877(c2382, strM3854, url, (byte[]) null, (HashMap) null, c3389));
                                    }
                                }
                            }
                        } else {
                            C5371.m9020(c3610);
                            c3610.f12022.m9432("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        C5371.m9020(c3610);
                        c3610.f12023.m9432("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    C5371.m9020(c3610);
                    c3610.f12023.m9432("ADID collection is disabled from Manifest. Skipping");
                }
                if (i3 != 0) {
                    c5235.f17282.m2199(2000L);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0826(C5235 c5235, InterfaceC1150 interfaceC1150, int i, boolean z) {
        super(interfaceC1150);
        this.f2922 = i;
        this.f2923 = c5235;
    }
}
