package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0071;
import p000.AbstractC0487;
import p000.AbstractC4489;
import p000.C1432;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC0071 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1432(19);

    /* JADX INFO: renamed from: ۥؓ */
    public final HashSet f281 = new HashSet();

    /* JADX INFO: renamed from: ۥؖ */
    public final String f282;

    /* JADX INFO: renamed from: ۥَ */
    public final String f283;

    /* JADX INFO: renamed from: ۥْ */
    public final String f284;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f285;

    /* JADX INFO: renamed from: ۥٖ */
    public final Uri f286;

    /* JADX INFO: renamed from: ۥٙ */
    public final String f287;

    /* JADX INFO: renamed from: ۥۖ */
    public final String f288;

    /* JADX INFO: renamed from: ۦٕ */
    public final List f289;

    /* JADX INFO: renamed from: ۦٗ */
    public String f290;

    /* JADX INFO: renamed from: ۦۛ */
    public final long f291;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f292;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f293;

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f293 = i;
        this.f292 = str;
        this.f284 = str2;
        this.f285 = str3;
        this.f283 = str4;
        this.f286 = uri;
        this.f290 = str5;
        this.f291 = j;
        this.f288 = str6;
        this.f289 = arrayList;
        this.f287 = str7;
        this.f282 = str8;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static GoogleSignInAccount m113(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC0487.m1090(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f290 = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f288.equals(this.f288)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f289);
        hashSet.addAll(googleSignInAccount.f281);
        HashSet hashSet2 = new HashSet(this.f289);
        hashSet2.addAll(this.f281);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f288.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f289);
        hashSet.addAll(this.f281);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f293);
        AbstractC4489.m7775(parcel, 2, this.f292);
        AbstractC4489.m7775(parcel, 3, this.f284);
        AbstractC4489.m7775(parcel, 4, this.f285);
        AbstractC4489.m7775(parcel, 5, this.f283);
        AbstractC4489.m7793(parcel, 6, this.f286, i);
        AbstractC4489.m7775(parcel, 7, this.f290);
        AbstractC4489.m7797(parcel, 8, 8);
        parcel.writeLong(this.f291);
        AbstractC4489.m7775(parcel, 9, this.f288);
        AbstractC4489.m7794(parcel, 10, this.f289);
        AbstractC4489.m7775(parcel, 11, this.f287);
        AbstractC4489.m7775(parcel, 12, this.f282);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
