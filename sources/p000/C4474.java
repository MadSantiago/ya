package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: renamed from: ۦٙؒۢٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4474 extends AbstractC0243 {

    /* JADX INFO: renamed from: ۦۜ */
    public static final Pair f14750 = new Pair("", 0L);

    /* JADX INFO: renamed from: ۥؓ */
    public final C1405 f14751;

    /* JADX INFO: renamed from: ۥؔ */
    public final C1489 f14752;

    /* JADX INFO: renamed from: ۥؖ */
    public final C4797 f14753;

    /* JADX INFO: renamed from: ۥً */
    public final C4797 f14754;

    /* JADX INFO: renamed from: ۥَ */
    public C3250 f14755;

    /* JADX INFO: renamed from: ۥْ */
    public SharedPreferences f14756;

    /* JADX INFO: renamed from: ۥٓ */
    public SharedPreferences f14757;

    /* JADX INFO: renamed from: ۥٕ */
    public final C4173 f14758;

    /* JADX INFO: renamed from: ۥٖ */
    public final C4173 f14759;

    /* JADX INFO: renamed from: ۥٙ */
    public final C4173 f14760;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f14761;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f14762;

    /* JADX INFO: renamed from: ۥۦ */
    public final C4173 f14763;

    /* JADX INFO: renamed from: ۥۧ */
    public final C1489 f14764;

    /* JADX INFO: renamed from: ۦؖ */
    public final C4797 f14765;

    /* JADX INFO: renamed from: ۦؗ */
    public final C1405 f14766;

    /* JADX INFO: renamed from: ۦؙ */
    public final C4797 f14767;

    /* JADX INFO: renamed from: ۦُ */
    public final C1405 f14768;

    /* JADX INFO: renamed from: ۦٕ */
    public long f14769;

    /* JADX INFO: renamed from: ۦٖ */
    public final C4173 f14770;

    /* JADX INFO: renamed from: ۦٗ */
    public final C1405 f14771;

    /* JADX INFO: renamed from: ۦٚ */
    public final C4173 f14772;

    /* JADX INFO: renamed from: ۦۛ */
    public String f14773;

    public C4474(C5371 c5371) {
        super(c5371);
        this.f14760 = new C4173(this, "session_timeout", 1800000L);
        this.f14753 = new C4797(this, "start_new_session", true);
        this.f14772 = new C4173(this, "last_pause_time", 0L);
        this.f14758 = new C4173(this, "session_id", 0L);
        this.f14751 = new C1405(this, "non_personalized_ads");
        this.f14764 = new C1489(this, "last_received_uri_timestamps_by_source");
        this.f14754 = new C4797(this, "allow_remote_dynamite", false);
        this.f14759 = new C4173(this, "first_open_time", 0L);
        AbstractC0487.m1090("app_install_time");
        this.f14771 = new C1405(this, "app_instance_id");
        this.f14767 = new C4797(this, "app_backgrounded", false);
        this.f14765 = new C4797(this, "deep_link_retrieval_complete", false);
        this.f14763 = new C4173(this, "deep_link_retrieval_attempts", 0L);
        this.f14766 = new C1405(this, "firebase_feature_rollouts");
        this.f14768 = new C1405(this, "deferred_attribution_cache");
        this.f14770 = new C4173(this, "deferred_attribution_cache_timestamp", 0L);
        this.f14752 = new C1489(this, "default_event_parameters");
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final boolean m7751(long j) {
        return j - this.f14760.m7371() > this.f14772.m7371();
    }

    @Override // p000.AbstractC0243
    /* JADX INFO: renamed from: ۥٓ */
    public final boolean mo504() {
        return true;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m7752(boolean z) {
        mo6517();
        C3610 c3610 = ((C5371) this.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12023.m9430(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m7755().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final SparseArray m7753() {
        Bundle bundleM3130 = this.f14764.m3130();
        int[] intArray = bundleM3130.getIntArray("uriSources");
        long[] longArray = bundleM3130.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9432("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final C5211 m7754() {
        mo6517();
        return C5211.m8806(m7755().getInt("consent_source", 100), m7755().getString("consent_settings", "G1"));
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final SharedPreferences m7755() {
        mo6517();
        m503();
        AbstractC0487.m1047(this.f14756);
        return this.f14756;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final SharedPreferences m7756() {
        mo6517();
        m503();
        SharedPreferences sharedPreferences = this.f14757;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        C5371 c5371 = (C5371) this.f18660;
        String strValueOf = String.valueOf(c5371.f17739.getPackageName());
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        C5590 c5590 = c3610.f12023;
        String strConcat = strValueOf.concat("_preferences");
        c5590.m9430(strConcat, "Default prefs file");
        SharedPreferences sharedPreferences2 = c5371.f17739.getSharedPreferences(strConcat, 0);
        this.f14757 = sharedPreferences2;
        return sharedPreferences2;
    }
}
