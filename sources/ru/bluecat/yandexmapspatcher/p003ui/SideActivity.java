package ru.bluecat.yandexmapspatcher.p003ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import java.util.Map;
import p000.AbstractActivityC2747;
import p000.AbstractC0502;
import p000.AbstractC1631;
import p000.AbstractC3933;
import p000.AbstractC4187;
import p000.AbstractC4489;
import p000.AbstractC5378;
import p000.C0857;
import p000.C2197;
import p000.C2767;
import p000.C3469;
import p000.C4164;
import p000.C4441;
import p000.InterfaceC5130;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class SideActivity extends AbstractActivityC2747 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: ۥ٘ */
    public static SideActivity f416;

    /* JADX INFO: renamed from: ۦۜ */
    public final InterfaceC5130 f417 = AbstractC3933.m7095(1, new C2767(2, this));

    /* JADX INFO: renamed from: ۦۣ */
    public String f418;

    @Override // p000.AbstractActivityC2747, p000.AbstractActivityC1500, p000.AbstractActivityC1700, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        f416 = this;
        AbstractC5378.m9058(getWindow(), false);
        SideActivity sideActivityM7812 = AbstractC4489.m7812();
        if (Build.VERSION.SDK_INT >= 34) {
            sideActivityM7812.overrideActivityTransition(0, R.anim.slide_in_left, R.anim.slide_out_left);
        } else {
            sideActivityM7812.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString(new C4441(new long[]{-5240605750447552913L, 2015779961029715701L}).toString())) == null) {
            finish();
        } else {
            this.f418 = string;
            AbstractC4187.m7373(this, new C0857(-1735272062, new C4164(20, this), true));
        }
    }

    @Override // p000.AbstractActivityC2747, android.app.Activity
    public final void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = AbstractC0502.f1815;
        if (sharedPreferences != null) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(this);
        }
        if (isFinishing()) {
            SideActivity sideActivityM7812 = AbstractC4489.m7812();
            if (Build.VERSION.SDK_INT >= 34) {
                sideActivityM7812.overrideActivityTransition(1, R.anim.slide_in_right, R.anim.slide_out_right);
            } else {
                sideActivityM7812.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
            }
        }
    }

    @Override // p000.AbstractActivityC2747, p000.AbstractActivityC1500, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (iArr.length != 0 && iArr[0] == 0) {
            if (i == 1) {
                C3469.f11514.getClass();
                C3469.m6257();
                return;
            }
            return;
        }
        App app = App.f407;
        Toast.makeText(AbstractC1631.m3410(), AbstractC1631.m3410().getString(R.string.toast_no_permission), 1).show();
        Intent intent = new Intent(new C4441(new long[]{6519399525398847642L, 8633657790213113946L, 9211119917361728485L, -3808084645948493684L, 6772426433934240969L, -2040616033870227785L, -9000530914812631728L}).toString());
        Uri uri = Uri.parse(new C4441(new long[]{2316934187649303405L, -9081158019430131912L, -569170919593890385L, -1768856174300967939L, 4509573193015570193L, 453956304355960755L}).toString());
        new C4441(new long[]{-2936062532170399731L, 2562674246750156603L, -3565371824259831591L}).toString();
        intent.setData(uri);
        startActivity(intent);
    }

    @Override // p000.AbstractActivityC2747, android.app.Activity
    public final void onResume() {
        super.onResume();
        Map map = AbstractC0502.f1819;
        SharedPreferences sharedPreferences = AbstractC0502.f1815;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C2197 c2197 = (C2197) this.f417.getValue();
        if (str != null) {
            if (c2197.m4259().contains(str)) {
                c2197.m4260(str);
            } else {
                c2197.m4261(str);
            }
        }
    }
}
